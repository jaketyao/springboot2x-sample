//package com.example.springboot.service;
//
//import com.example.springboot.dao.BooksRepository;
//import com.example.springboot.model.Books;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.lang.model.element.Element;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//import java.util.stream.StreamSupport;
//
///**
// * @author Yao.Jie
// * @description ${DESCRIPTION}
// * @create 2018-04-11 14:51
// **/
//
//@Service
//public class BooksService {
//
//
//    @Autowired
//    BooksRepository booksRepository;
//
//
//    public void save(Books books){
//
//        booksRepository.save(books);
//
//    }
//
//    public List<Books> getAll(){
//
//
//        return StreamSupport.stream(booksRepository.findAll().spliterator(),false)
//                .collect(Collectors.toList());
//    }
//
//
//    public Stream<Books> findByAuthor(String author){
//
//      return   booksRepository.findByAuthor(author);
//
//    }
//
//
//}
