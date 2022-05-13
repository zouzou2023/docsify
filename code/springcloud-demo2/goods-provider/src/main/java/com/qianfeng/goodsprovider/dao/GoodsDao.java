package com.qianfeng.goodsprovider.dao;

import com.qianfeng.goodscommons.pojo.Book;

import java.util.List;

public interface GoodsDao {

    List<Book> getBookList();

    Book getBookDetail(Integer id);

    void addBook(Book book);
}
