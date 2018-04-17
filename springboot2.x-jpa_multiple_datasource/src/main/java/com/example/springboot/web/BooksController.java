//package com.example.springboot.web;
//
//import com.example.springboot.model.Books;
//import com.example.springboot.service.BooksService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @author Yao.Jie
// * @description ${DESCRIPTION}
// * @create 2018-04-11 16:04
// **/
//@RestController
//public class BooksController {
//
//    @Autowired
//    BooksService booksService;
//
//    @GetMapping("/")
//    @ResponseBody
//    public List<Books> getAll(){
//
//        return booksService.getAll();
//    }
//}
