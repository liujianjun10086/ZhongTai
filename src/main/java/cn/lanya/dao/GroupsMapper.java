package cn.lanya.dao;

import cn.lanya.po.Groups;
import java.util.List;

public interface GroupsMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(Groups record);

    Groups selectByPrimaryKey(Integer groupId);

    List<Groups> selectAll();

    int updateByPrimaryKey(Groups record);
}