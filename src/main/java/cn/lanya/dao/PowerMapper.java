package cn.lanya.dao;

import cn.lanya.po.Power;
import java.util.List;

public interface PowerMapper {
    int deleteByPrimaryKey(Integer powerId);

    int insert(Power record);

    Power selectByPrimaryKey(Integer powerId);

    List<Power> selectAll();

    int updateByPrimaryKey(Power record);
    //查询功能
    List<Power> selectByStaffJnum(String staffJnum);
}