package com.gcc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gcc.domain.Book;

import java.util.List;

//业务层
public interface BookService {


    int save(Book book);
    int update(Book book);
    int delete(Integer id);

    Book getById(Integer id);
    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int page);


}
