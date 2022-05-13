package com.qianfeng.goodsui.service;

import com.qianfeng.goodscommons.pojo.Book;
import com.qianfeng.goodscommons.vo.ResultVo;

import java.util.List;

public interface GoodsUIService {
    void testGoodsProvider();

    List<Book> getBookList();

    ResultVo getBookDetail(Integer id);

    String addBook(Book book);
}
