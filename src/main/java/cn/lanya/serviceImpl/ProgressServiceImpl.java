package cn.lanya.serviceImpl;

import cn.lanya.dao.ProgressMapper;
import cn.lanya.po.Progress;
import cn.lanya.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressServiceImpl implements ProgressService {
    @Autowired
    private ProgressMapper progressMapper;

    @Override
    public List<Progress> getAll() {
        return progressMapper.selectAll();
    }
}
