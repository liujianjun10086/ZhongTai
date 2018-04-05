package cn.lanya.dao;

import cn.lanya.po.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}