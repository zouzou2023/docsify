package com.qianfeng.customerui.feign;

import com.qianfeng.goodscommons.pojo.Customer;
import com.qianfeng.goodscommons.vo.ResultVo;
import com.sun.java.browser.plugin2.liveconnect.v1.Result;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerUIFeignImpl implements CustomerUIFeign {

    @Override
    public List<Customer> getCustomerList() {
        return null;
    }

    @Override
    public ResultVo getCustomerDetail(Integer id) {
        return ResultVo.error("feign的服务降级响应");
    }
}
