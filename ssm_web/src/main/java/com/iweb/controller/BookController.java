package com.iweb.controller;

import com.iweb.model.Book;
import com.iweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("bookService")
    BookService bookService;

    @RequestMapping(value = "/main")
    public ModelAndView findAll(ModelAndView mv){
        List<Book> bookList = bookService.getAll();
        mv.addObject("books",bookList);
        mv.setViewName("main");


        System.out.println("123");
        System.out.println("789");

        System.out.println("push commit");
        return mv;

    }
}
