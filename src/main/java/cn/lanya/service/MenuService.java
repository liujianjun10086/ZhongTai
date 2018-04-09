package cn.lanya.service;

import cn.lanya.po.Module;
import cn.lanya.po.Power;

import java.util.List;

public interface MenuService {
    List<Power> gettAll();

    List<Module> getByStaffJnum(String staffJnum);

    List<Power> getPowerByStaffJnum(String staffJnum);
}
