package cn.lanya.serviceImpl;

import cn.lanya.dao.OrganizeMapper;
import cn.lanya.po.Organize;
import cn.lanya.service.OrganizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizeServiceImpl implements OrganizeService {

    @Autowired
    private OrganizeMapper organizeMapper;

    @Override
    public List<Organize> getAll() {
        return organizeMapper.selectAll();
    }
}
