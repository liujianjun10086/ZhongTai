package cn.lanya.dao;

import cn.lanya.po.Organize;
import java.util.List;

public interface OrganizeMapper {
    int deleteByPrimaryKey(Integer organizeId);

    int insert(Organize record);

    Organize selectByPrimaryKey(Integer organizeId);

    List<Organize> selectAll();

    int updateByPrimaryKey(Organize record);
}