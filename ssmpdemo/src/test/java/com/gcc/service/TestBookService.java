package com.gcc.service;

import com.gcc.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookService {

    @Autowired
     private BookService bookService;



    @Test
    public void testBookById(){
        bookService.getById(5);
    }

    @Test
    public void testGetAll(){
        bookService.getAll();
    }


    @Test
    public void testInsert(){
        Book book=new Book();
        book.setName("412新增测试数据");
        book.setType("测试");
        book.setDescription("412新增测试数据");
        bookService.save(book);

    }

    public void testUpdate(){

    }


}
