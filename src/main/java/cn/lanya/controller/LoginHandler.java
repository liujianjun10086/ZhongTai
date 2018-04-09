package cn.lanya.controller;

import cn.lanya.po.Module;
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
        Staff staff1= loginService.getByStaff(staff);
        if (staff1!=null){
            List<Power> powerList =getPowerByStaffJnum(staff1.getStaffJnum());
            List<Module> moduleList=getByStaffJnum(staff1.getStaffJnum());
            HttpSession session =request.getSession(true);
            session.setAttribute("staff",staff1);
            session.setAttribute("moduleList",moduleList);
            session.setAttribute("powerList",powerList);
            modelAndView.setViewName("top");
            modelAndView.setViewName("left");

            return "main";
        }
        return "error";
    }
    @Autowired
    private MenuService menuService;
//    public List<Power> getAll(){
//        return menuService.gettAll();
//    }
    public List<Module> getByStaffJnum(String staffJnum){
        return menuService.getByStaffJnum(staffJnum);

    }
    public List<Power> getPowerByStaffJnum(String staffJnum){
        return menuService.getPowerByStaffJnum(staffJnum);
    }

}
