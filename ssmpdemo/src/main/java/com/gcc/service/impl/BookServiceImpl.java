package com.gcc.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gcc.dao.BookDao;
import com.gcc.domain.Book;
import com.gcc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }


    @Override
    public int save(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public int update(Book book) {
        return bookDao.updateById(book);
    }

    @Override
    public int delete(Integer id) {
        return bookDao.deleteById(id);
    }


    @Override
    public IPage<Book> getPage(int currentPage, int page) {
        return null;
    }
}
