package cn.lanya.service;

import cn.lanya.po.Staff;

import java.util.List;

public interface StaffService {
   Staff getStaff(int id);

   List<Staff> getAll();
}
