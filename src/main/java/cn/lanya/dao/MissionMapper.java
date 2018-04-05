package cn.lanya.dao;

import cn.lanya.po.Mission;
import java.util.List;

public interface MissionMapper {
    int deleteByPrimaryKey(Integer missionId);

    int insert(Mission record);

    Mission selectByPrimaryKey(Integer missionId);

    List<Mission> selectAll();

    int updateByPrimaryKey(Mission record);
}