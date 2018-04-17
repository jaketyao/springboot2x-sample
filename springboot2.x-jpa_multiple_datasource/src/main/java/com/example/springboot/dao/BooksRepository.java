//package com.example.springboot.dao;
//
//import com.example.springboot.model.Books;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.stream.Stream;
//
///**
// * @author Yao.Jie
// * @description ${DESCRIPTION}
// * @create 2018-04-11 14:51
// **/
//@Repository
//public  interface BooksRepository extends PagingAndSortingRepository<Books,Long> {
//
//    //PagingAndSortingRepository 包含分页
//
//    //CrudRepository
//
//
//    // custom query example and return a stream
//    @Query("select c from Books c where c.author = :author")
//    Stream<Books> findByAuthor(@Param("author") String author);
//
//
//
//    List<Books> findBooksByAuthor(Books books);
//
//}
