package cn.lanya.dao;

import cn.lanya.po.Staff;
import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    Staff selectByPrimaryKey(Integer staffId);

    List<Staff> selectAll();

    int updateByPrimaryKey(Staff record);
}