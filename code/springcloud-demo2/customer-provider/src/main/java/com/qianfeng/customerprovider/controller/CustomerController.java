package com.qianfeng.customerprovider.controller;

import com.qianfeng.customerprovider.dao.CustomerDao;
import com.qianfeng.goodscommons.pojo.Customer;
import com.qianfeng.goodscommons.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/list")
    public List<Customer> list(){
        return customerDao.getCustomerList();
    }
    @RequestMapping("/detail")
    public ResultVo detail(@RequestParam("id")Integer id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Customer customer = customerDao.getCustomerById(id);
        return ResultVo.ok(customer);
    }
}
