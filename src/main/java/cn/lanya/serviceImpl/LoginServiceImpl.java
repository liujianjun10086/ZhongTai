package cn.lanya.serviceImpl;

import cn.lanya.dao.StaffMapper;
import cn.lanya.po.Staff;
import cn.lanya.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StaffMapper staffMapper;
    @Override
    public Staff getByStaff(Staff staff) {
        return staffMapper.selectByStaff(staff);
    }
}
