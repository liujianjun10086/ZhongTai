package cn.lanya.dao;

import cn.lanya.po.Staff;
import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff staff);

    Staff selectByPrimaryKey(Integer staffId);

    List<Staff> selectAll();

    int updateByPrimaryKey(Staff record);

    Staff selectByStaff(Staff staff);

    Staff selectByStaff_num(int id);
}