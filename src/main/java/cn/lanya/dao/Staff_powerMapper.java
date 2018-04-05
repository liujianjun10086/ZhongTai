package cn.lanya.dao;

import cn.lanya.po.Staff_power;
import java.util.List;

public interface Staff_powerMapper {
    int deleteByPrimaryKey(Integer staffPowerId);

    int insert(Staff_power record);

    Staff_power selectByPrimaryKey(Integer staffPowerId);

    List<Staff_power> selectAll();

    int updateByPrimaryKey(Staff_power record);
}