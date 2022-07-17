package com.gcc.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gcc.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookDao {

    @Autowired
    private BookDao bookDao;

    @Test
    void testFindById(){
        System.out.println(bookDao.selectById(3));
    }
    @Test
    void testFindAll(){
      System.out.println(bookDao.selectList(null));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("测试123");
        book.setType("测试123");
        bookDao.insert(book);
    }

    @Test
    void testUpadte(){
        Book book = new Book();
        book.setId(51);
        book.setName("测试update");
        book.setType("测试update");
        book.setDescription("测试update");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
        System.out.println(bookDao.deleteById(51));
    }








    @Test
    void testGetPage(){
        IPage page = new Page(1,5);
        bookDao.selectPage(page,null);
        System.out.println(page.getRecords());
    }

    @Test
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
    }

}
