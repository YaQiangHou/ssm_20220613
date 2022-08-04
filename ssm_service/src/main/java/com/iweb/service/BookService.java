package com.iweb.service;

import com.iweb.model.Book;

import java.util.List;

public interface BookService {

    //查询所有的图书信息
    List<Book> getAll();
}
