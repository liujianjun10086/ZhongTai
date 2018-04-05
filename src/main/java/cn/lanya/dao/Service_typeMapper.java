package cn.lanya.dao;

import cn.lanya.po.Service_type;
import java.util.List;

public interface Service_typeMapper {
    int deleteByPrimaryKey(Integer serviceTypeId);

    int insert(Service_type record);

    Service_type selectByPrimaryKey(Integer serviceTypeId);

    List<Service_type> selectAll();

    int updateByPrimaryKey(Service_type record);
}