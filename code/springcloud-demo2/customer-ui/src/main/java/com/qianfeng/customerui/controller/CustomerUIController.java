package com.qianfeng.customerui.controller;

import com.qianfeng.customerui.feign.CustomerUIFeign;
import com.qianfeng.goodscommons.pojo.Customer;
import com.qianfeng.goodscommons.vo.ResultVo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerUIController {

    @Resource
    private CustomerUIFeign customerUIFeign;

    /**
     * 查询所有顾客
     */
    @RequestMapping("/list")
    public List<Customer> list(){
        List<Customer> customers = customerUIFeign.getCustomerList();
        return customers;
    }
    /**
     * 根据id查询顾客详情
     */
    @RequestMapping("/detail/{id}")
    public ResultVo detail(@PathVariable("id")Integer id){
        return customerUIFeign.getCustomerDetail(id);
    }
}
