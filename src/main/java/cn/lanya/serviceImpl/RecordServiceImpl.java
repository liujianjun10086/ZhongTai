package cn.lanya.serviceImpl;

import cn.lanya.dao.RecordMapper;
import cn.lanya.po.Record;
import cn.lanya.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;
    @Override
    public List<Record> getAll() {
        return recordMapper.selectAll();
    }
}
