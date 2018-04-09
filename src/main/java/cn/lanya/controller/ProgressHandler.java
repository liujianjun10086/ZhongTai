package cn.lanya.controller;

import cn.lanya.po.Progress;
import cn.lanya.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProgressHandler {
@Autowired
    private ProgressService service;
    @RequestMapping("/addProgress")
    public  String  addProgress(Progress progress) {

        int i=service.insert(progress);
        if(i>0) {
            return "imglist";
        }else {
            return "error";
        }



    }
}
