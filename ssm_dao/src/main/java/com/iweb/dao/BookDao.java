package com.iweb.dao;

import com.iweb.model.Book;

import java.util.List;

public interface BookDao {

    //查询所有图书信息
     List<Book> findAll();
}
