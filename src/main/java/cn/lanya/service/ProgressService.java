package cn.lanya.service;

import cn.lanya.po.Progress;

import java.util.List;

public interface ProgressService {
    //获取所有的进程 ljj
    List<Progress> getAll();

//    添加审批进度
    int insert(Progress progress);


}
