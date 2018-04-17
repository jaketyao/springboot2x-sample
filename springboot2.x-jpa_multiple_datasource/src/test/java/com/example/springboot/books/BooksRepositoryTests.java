//package com.example.springboot.books;
//
//import com.example.springboot.dao.BooksRepository;
//import com.example.springboot.model.Books;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
//
///**
// * @author Yao.Jie
// * @description ${DESCRIPTION}
// * @create 2018-04-11 17:31
// *
// *
// **/
//@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = NONE)
//public class BooksRepositoryTests {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//
//    @Autowired
//    BooksRepository booksRepository;
//
//    @Test
//    public void testFindByAuthor() {
//        Books books = new Books();
//        books.setBookName("火影");
//        books.setAuthor("岸本齐史");
//
//        entityManager.persist(books);
//
//        List<Books> findByAuthor = booksRepository.findByAuthor(books.getAuthor()).collect(Collectors.toList());
//
//        findByAuthor.forEach(i-> System.out.println(i.getAuthor()));
//
//
//        assertThat(findByAuthor).extracting(Books::getAuthor).containsOnly(books.getAuthor());
//
//
//
//    }
//
//
//    /**
//     * 测试 example查询
//     */
//    public void testExample(){
//
//
//    }
//}
