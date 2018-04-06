package cn.lanya.serviceImpl;

import cn.lanya.dao.RecordMapper;
import cn.lanya.po.Record;
import cn.lanya.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    //新增审批
    @Override
    public int addRecord(Record record) {
        return recordMapper.insertRecord(record);
    }
}
