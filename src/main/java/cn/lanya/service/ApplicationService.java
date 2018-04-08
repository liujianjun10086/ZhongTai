package cn.lanya.service;

import cn.lanya.po.Application;

import java.util.List;

public interface ApplicationService {

    int addApplication();

    int deleteById();

    List<Application> getAll();

    List<Application> getByInfo(Application application);

    Application getById(Integer id);
}
