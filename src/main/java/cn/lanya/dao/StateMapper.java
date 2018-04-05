package cn.lanya.dao;

import cn.lanya.po.State;
import java.util.List;

public interface StateMapper {
    int deleteByPrimaryKey(Integer stateId);

    int insert(State record);

    State selectByPrimaryKey(Integer stateId);

    List<State> selectAll();

    int updateByPrimaryKey(State record);
}