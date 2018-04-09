package cn.lanya.serviceImpl;

import cn.lanya.dao.ModuleMapper;
import cn.lanya.dao.PowerMapper;
import cn.lanya.po.Module;
import cn.lanya.po.Power;
import cn.lanya.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private PowerMapper powerMapper;
    @Override
    public List<Power> gettAll() {
        return powerMapper.selectAll();
    }
    @Autowired
    private ModuleMapper moduleMapper;
    @Override
    public List<Module> getByStaffJnum(String staffJnum) {
        return moduleMapper.selectByStaffJnum(staffJnum);
    }

    @Override
    public List<Power> getPowerByStaffJnum(String staffJnum) {
        return powerMapper.selectByStaffJnum(staffJnum);
    }
}
