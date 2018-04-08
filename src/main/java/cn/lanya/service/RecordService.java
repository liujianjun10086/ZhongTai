package cn.lanya.service;

import cn.lanya.po.Record;
import java.util.List;

public interface RecordService {

    List<Record> getAll();

    int addRecord(Record record);
   //员工查询个人办理的订单
    List<Record> getSelectRecordByRecord_staff(String staffJnum);

}
