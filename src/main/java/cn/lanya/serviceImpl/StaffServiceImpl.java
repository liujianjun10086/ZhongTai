package cn.lanya.serviceImpl;

import cn.lanya.dao.StaffMapper;
import cn.lanya.po.Staff;
import cn.lanya.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;
    @Override
    public Staff getStaff(int id) {
        return staffMapper.selectByStaff_num(id);
    }

    @Override
    public List<Staff> getAll() {
        return staffMapper.selectAll();
    }
}
