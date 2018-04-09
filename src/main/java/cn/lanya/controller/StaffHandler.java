package cn.lanya.controller;

import cn.lanya.po.Staff;
import cn.lanya.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StaffHandler {
    @Autowired
    private StaffService staffService;
    @RequestMapping("/staffList")
    public String getAll(HttpServletRequest request){
        HttpSession session= request.getSession(true);
        List<Staff> staffList=staffService.getAll();
        session.setAttribute("staffList",staffList);

        return "staffList";
    }
}
