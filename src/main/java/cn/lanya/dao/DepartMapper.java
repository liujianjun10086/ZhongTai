package cn.lanya.dao;

import cn.lanya.po.Depart;
import java.util.List;

public interface DepartMapper {
    int deleteByPrimaryKey(Integer departId);

    int insert(Depart record);

    Depart selectByPrimaryKey(Integer departId);

    List<Depart> selectAll();

    int updateByPrimaryKey(Depart record);
}