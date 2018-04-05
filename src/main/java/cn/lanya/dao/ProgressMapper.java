package cn.lanya.dao;

import cn.lanya.po.Progress;
import java.util.List;

public interface ProgressMapper {
    int deleteByPrimaryKey(Integer progressId);

    int insert(Progress record);

    Progress selectByPrimaryKey(Integer progressId);

    List<Progress> selectAll();

    int updateByPrimaryKey(Progress record);
}