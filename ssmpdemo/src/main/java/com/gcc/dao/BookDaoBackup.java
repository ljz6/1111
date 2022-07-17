package com.gcc.dao;

import com.gcc.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

//@Mapper
public interface BookDaoBackup {
    @Select("select * from book where id=#{id}")
    Book findById(Integer id);

    @Select("select * from book")
    ArrayList<Book> findAllBook();

}
