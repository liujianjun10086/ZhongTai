package cn.lanya.serviceImpl;

import cn.lanya.dao.ApplicationMapper;
import cn.lanya.po.Application;
import cn.lanya.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {


    @Autowired
    private ApplicationMapper mapper;


    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public int addApplication(Application application) {
        return mapper.insert(application);
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Application getApplicationById(int id) {
        return applicationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Application> getAll() {
        return mapper.selectAll();
    }

    @Override
    public List<Application> getByInfo(Application application) {
        return mapper.selectByInfo(application);
    }

    @Override
    public Application getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
