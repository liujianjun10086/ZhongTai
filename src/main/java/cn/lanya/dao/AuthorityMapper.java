package cn.lanya.dao;

import cn.lanya.po.Authority;
import java.util.List;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer authorityId);

    int insert(Authority record);

    Authority selectByPrimaryKey(Integer authorityId);

    List<Authority> selectAll();

    int updateByPrimaryKey(Authority record);
}