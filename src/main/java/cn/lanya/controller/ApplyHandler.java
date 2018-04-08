package cn.lanya.controller;

import cn.lanya.po.Organize;
import cn.lanya.po.Progress;
import cn.lanya.po.Record;
import cn.lanya.service.OrganizeService;
import cn.lanya.service.ProgressService;
import cn.lanya.service.RecordService;
import cn.lanya.util.DateTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class ApplyHandler {

    @Autowired
    private RecordService recordService;
    @Autowired
    private OrganizeService organizeService;
    @Autowired
    private ProgressService progressService;

    //获取所有机构选项
    private List<Organize> organizeModel(){
        List<Organize> organizeList =organizeService.getAll();
        return organizeList;
    }
    //获取所有进程选项
    private List<Progress> progressModel(){
        List<Progress> progressList =progressService.getAll();
        return progressList;
    }
    @RequestMapping("/addApply")
    public String getInfo(HttpSession session){
        session.setAttribute("organizeList",organizeModel());
        session.setAttribute("progressList",progressModel());
        return "addApply";
    }

    //添加审批 ljj
    @RequestMapping(value="/apply",method= RequestMethod.POST)
    public String addRecord(HttpServletRequest req, HttpServletResponse rep, HttpSession session) throws ServletException, IOException {
        String username=req.getParameter("username");
        String phone=req.getParameter("phone");
        String idcard=req.getParameter("idcard");
        String applymoney =req.getParameter("applymoney");
        String org =req.getParameter("selectType");
        String progress =req.getParameter("progress");
        String referee =req.getParameter("referee");
        String date =req.getParameter("date");
        Record record =new Record();
        record.setRecordCustomerName(username);
        record.setRecordCustomerPhone(phone);
        record.setRecordCustomerNum(idcard);
        record.setRecordApply(Double.parseDouble(applymoney));
        record.setRecordCommision(0.0);
        record.setRecordOrganize(1);
        record.setRecordProgress(2);
        record.setRecordGranted(0.0);
        record.setRecordStaff("admin");
        record.setRecordReferee(referee);
        record.setRecordDatetime(DateTools.getDate(date));
        int count =recordService.addRecord(record);
        if(count>0){
            session.setAttribute("result",count);
            return "addApply";
        }
        return "error";
    }




}
