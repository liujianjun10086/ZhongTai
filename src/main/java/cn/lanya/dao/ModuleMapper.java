package cn.lanya.dao;

import cn.lanya.po.Module;
import java.util.List;

public interface ModuleMapper {
    int deleteByPrimaryKey(Integer moduleId);

    int insert(Module record);

    Module selectByPrimaryKey(Integer moduleId);

    List<Module> selectAll();

    int updateByPrimaryKey(Module record);

    List<Module> selectByStaffJnum(String staffJnum);
}