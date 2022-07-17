package com.gcc.controller;

import com.gcc.R;
import com.gcc.domain.Book;
import com.gcc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;



     /*
         public List<Book> getAll()
           {
                return bookService.getAll();
            }
    */
    @GetMapping
    public R getAll()
    {
       /*R r = new R();
        r.setFlag(true);
        r.setData(bookService.getAll());*/
        return new R(true,bookService.getAll());
    }

   @GetMapping("{id}")
   public R getById(@PathVariable  Integer id){
        return  new R(true, bookService.getById(id));
   }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.delete(id)>0);
    }

    @PostMapping
    public R save(@RequestBody  Book book){
        return new R( bookService.save(book)>0);
    }

    @PutMapping
    public R update(@RequestBody  Book book){
        return new R( bookService.update(book)>0);
    }







}
