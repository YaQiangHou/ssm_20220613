package com.iweb.service;

import com.iweb.dao.BookDao;
import com.iweb.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> getAll() {
        return bookDao.findAll();
    }
}
