package com.qianfeng.goodsui.controller;

import com.qianfeng.goodscommons.pojo.Book;
import com.qianfeng.goodscommons.vo.ResultVo;
import com.qianfeng.goodsui.service.GoodsUIService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ui")
public class GoodsUIController {
    @Resource
    private GoodsUIService goodsUIService;

    /**
     * 测试goods-ui调用goods-provider
     */
    @RequestMapping("/test")
    public String test(){
        goodsUIService.testGoodsProvider();
        return "success";
    }
    /**
     * 查询所有图书
     */
    @RequestMapping("/list")
    public List<Book> list(){
        List<Book> bookList = goodsUIService.getBookList();
        return bookList;
    }
    /**
     * 根据id查询图书
     */
    @RequestMapping("/detail/{id}")
    public ResultVo detail(@PathVariable("id")Integer id){
        ResultVo book = goodsUIService.getBookDetail(id);
        return book;
    }
    /**
     * 添加图书
     */
    @PostMapping("/add")
    public String add(@RequestBody Book book){
        return goodsUIService.addBook(book);
    }

}

