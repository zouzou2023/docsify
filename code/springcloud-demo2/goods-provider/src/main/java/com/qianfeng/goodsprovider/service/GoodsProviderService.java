package com.qianfeng.goodsprovider.service;

import com.qianfeng.goodscommons.pojo.Book;

import java.util.List;

public interface GoodsProviderService {
    List<Book> getBookList();

    Book getBookDetail(Integer id);

    void addBook(Book book);
}
