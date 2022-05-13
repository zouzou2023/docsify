package com.qianfeng.goodsprovider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.qianfeng.goodscommons.pojo.Book;
import com.qianfeng.goodsprovider.service.GoodsProviderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class GoodsProviderController {

    @Resource
    private GoodsProviderService goodsProviderService;

    /**
     * 测试goods-ui调用是否成功
     */
    @RequestMapping("/test")
    public String test(){
        System.out.println("进入了goods-provier~~~~");
        return "调用成功";
    }
    /**
     * 返回所有图书
     */
    @RequestMapping("/list")
    public List<Book> list(){
        List<Book> bookList = goodsProviderService.getBookList();
        return bookList;
    }
    /**
     * 查询图书详情
     */
    @RequestMapping("/detail/{id}")
    public Book detail(@PathVariable("id")Integer id){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Book book = goodsProviderService.getBookDetail(id);
        return book;
    }
    /**
     * 添加图书
     */
    @PostMapping("/add")
    public String add(@RequestBody Book book){
        goodsProviderService.addBook(book);
        return "success";
    }

    @HystrixCommand(fallbackMethod = "fallBack",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value="true"),//开启熔断器
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value="10000"),//时间
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),//次数
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="50")//服务错误率
    })
    @RequestMapping("/test_hystrix")
    public String testHystrix(@RequestParam("num")Integer num){
        int n = (int)Math.floor(Math.random()*100);
        int result = n/num;
        return "服务正常返回: "+n+"/"+num+"="+result;
    }
    public String fallBack(@RequestParam("num")Integer num){
        return "服务降级响应:num为0";
    }
}
