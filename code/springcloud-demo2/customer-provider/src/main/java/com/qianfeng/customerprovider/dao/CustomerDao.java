package com.qianfeng.customerprovider.dao;

import com.qianfeng.goodscommons.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CustomerDao {

    List<Customer> getCustomerList();

    void add(Customer customer);

    void deleteBatch(@Param("ids") Integer[] ids);

    Customer getCustomerById(Integer id);
}
