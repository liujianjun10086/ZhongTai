package cn.lanya.controller;

import cn.lanya.po.Application;
import cn.lanya.po.Organize;
import cn.lanya.po.Progress;
import cn.lanya.po.Record;
import cn.lanya.service.ApplicationService;
import cn.lanya.service.OrganizeService;
import cn.lanya.service.ProgressService;
import cn.lanya.service.RecordService;
import cn.lanya.util.DateTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/application")
@Controller
public class ApplyHandler {

    @Autowired
    private RecordService recordService;
    @Autowired
    private OrganizeService organizeService;
    @Autowired
    private ProgressService progressService;
    @Autowired
    private ApplicationService applicationService;

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
    public String getInfo(HttpServletRequest req,HttpSession session){
        session.setAttribute("organizeList",organizeModel());
        session.setAttribute("progressList",progressModel());
        String id =req.getParameter("id");
        Application application =applicationService.getApplicationById(Integer.parseInt(id));
        session.setAttribute("application",application);
        return "addApply";
    }

    //添加审批 ljj
    @RequestMapping(value="/apply",method= RequestMethod.POST)
    public String addRecord(HttpServletRequest req, HttpServletResponse rep, HttpSession session) throws ServletException, IOException {
        String id=req.getParameter("id");
        String username=req.getParameter("username");
        String phone=req.getParameter("phone");
        String idcard=req.getParameter("idcard");
        String applymoney =req.getParameter("applymoney");
        String org =req.getParameter("selectType");
        String progress =req.getParameter("progress");
        String referee =req.getParameter("referee");
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
        record.setRecordDatetime(new Timestamp(new Date().getTime()));
        int count =recordService.addRecord(record);
        if(count>0){
            session.setAttribute("result",count);
            int cot =applicationService.deleteById(Integer.parseInt(id));
            if(cot>0){
                System.out.print("删除成功");
            }
            return "addApply";
        }
        return "error";
    }


    @RequestMapping(value = "/searchapply", method = RequestMethod.POST)
    public ModelAndView searchApply(HttpServletRequest request){
        ModelAndView model = new ModelAndView();
        Application application = new Application();
        if (request.getParameter("cname")!=""){
            application.setApplicationUsername("%"+request.getParameter("cname")+"%");
        }
        if (request.getParameter("cphone")!=""){
            application.setApplicationPhone("%"+request.getParameter("cphone")+"%");
        }
        if (request.getParameter("cnumber")!=""){
            application.setApplicationNumber("%"+request.getParameter("cphone")+"%");
        }
        List<Application> list = applicationService.getByInfo(application);

        model.addObject("applyList",list);
        model.setViewName("applylist");
        return model;
    }

    @RequestMapping("/getallapply")
    public ModelAndView showAllApply(){
        ModelAndView model = new ModelAndView();
        List<Application> list = applicationService.getAll();
        model.addObject("applyList",list);
        model.setViewName("applylist");
        return model;
    }
}