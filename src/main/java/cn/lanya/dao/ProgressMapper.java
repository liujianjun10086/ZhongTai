package cn.lanya.dao;

import cn.lanya.po.Progress;
import java.util.List;

public interface ProgressMapper {
    int deleteByPrimaryKey(Integer progressId);

//添加审批进度
    int insert(Progress progress);

    Progress selectByPrimaryKey(Integer progressId);

    List<Progress> selectAll();

    int updateByPrimaryKey(Progress record);
}