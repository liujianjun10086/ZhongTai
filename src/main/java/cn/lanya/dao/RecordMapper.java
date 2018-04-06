package cn.lanya.dao;

import cn.lanya.po.Record;
import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(Record record);

    Record selectByPrimaryKey(Integer recordId);

    List<Record> selectAll();

    int updateByPrimaryKey(Record record);

    //新增审批 ljj
    int insertRecord(Record record);

}