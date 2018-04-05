package cn.lanya.dao;

import cn.lanya.po.Application;
import java.util.List;

public interface ApplicationMapper {
    int deleteByPrimaryKey(Integer applicationId);

    int insert(Application record);

    Application selectByPrimaryKey(Integer applicationId);

    List<Application> selectAll();

    int updateByPrimaryKey(Application record);
}