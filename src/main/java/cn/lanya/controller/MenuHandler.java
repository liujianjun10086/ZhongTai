package cn.lanya.controller;

import cn.lanya.po.Record;
import cn.lanya.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MenuHandler {


    @Autowired
    private RecordService recordService;



    /**
     * 点击跳转到审批列表（只是跳转 其他自行完成）
     * @return
     */
    @RequestMapping("/recordList")
    public String getAllRecord(HttpServletRequest request){
        List<Record> recordList= recordService.getAll();
       HttpSession session=request.getSession(true);
        session.setAttribute("recordList",recordList);
        return "right";
    }

    /**
     * 点击跳转到新增审批
     * @return
     */
    @RequestMapping("/menuAddRecord")
    public String addRecord(){
        return "imgtable";
    }

    /**
     * 点击跳转到新增进度
     * @return
     */
    @RequestMapping("/menuAddProgress")
    public String menuAddProgress(){
        return "imglist";
    }

    /**
     * 点击跳转到新增机构
     * @return
     */
    @RequestMapping("/menuAddOrganize")
    public String menuAddOrganize(){
        return "form";
    }

    /**
     * 点击跳转到申请列表(未完成 )
     * @return
     */
    @RequestMapping("/menuApplyList")
    public String getAllApply(){

       return "applylsit";
    }
}
