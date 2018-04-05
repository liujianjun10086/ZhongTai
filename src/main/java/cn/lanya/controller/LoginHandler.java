package cn.lanya.controller;

import cn.lanya.po.Power;
import cn.lanya.po.Staff;
import cn.lanya.service.LoginService;
import cn.lanya.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginHandler {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public String getByStaff(Staff staff, ModelAndView modelAndView, HttpServletRequest request){
        System.err.print(1);
        Staff staff1= loginService.getByStaff(staff);
        System.out.print(staff1.getStaffId());
        if (staff1!=null){
            List<Power> powerList =getAll();
            HttpSession session =request.getSession(true);
            session.setAttribute("powerList",powerList);
            modelAndView.setViewName("top");

            return "main";
        }
        return "error";
    }
    @Autowired
    private MenuService menuService;
    public List<Power> getAll(){
        return menuService.gettAll();
    }

}
