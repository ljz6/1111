package com.gcc.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gcc.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBoookServicebackup {

    @Autowired
    private BookService bookService;
    @Test
    void testGetByid(){
        System.out.println(bookService.getById(5));
    }
    @Test
    void testFindAll(){
        System.out.println(bookService.getAll());
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("测试service123");
        book.setType("测试service123");
        book.setDescription("测试service123");
        bookService.save(book);
    }

    @Test
    void testUpadte(){
        Book book = new Book();
        book.setId(51);
        book.setName("测试service-update");
        book.setType("测试service-update");
        book.setDescription("测试service-update");
        bookService.update(book);
    }
    @Test
    void testDelete(){
        System.out.println(bookService.delete(51));
    }

    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getRecords());
    }

    /*@Test
    void testGetBy(){
        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }
    @Test
    void testGetBy2(){
        String strName="Spring";
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
        lqw.like(strName!=null,Book::getName,strName);
        bookDao.selectList(lqw);
    }*/


}
