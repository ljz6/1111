package com.gcc.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookDaoBackup {

     @Autowired
     private BookDaoBackup backup;
     @Test
     void testFindById(){
         System.out.println(backup.findById(1));
     }
     @Test
     void testFindAllBook(){
          System.out.println(backup.findAllBook());
     }

}
