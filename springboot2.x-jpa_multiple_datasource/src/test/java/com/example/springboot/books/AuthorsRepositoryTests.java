//package com.example.springboot.books;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import com.example.springboot.dao.AuthorRepository;
//import com.example.springboot.model.Author;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.springboot.dao.BooksRepository;
//import com.example.springboot.model.Books;
//import org.springframework.transaction.annotation.Transactional;
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
//public class AuthorsRepositoryTests {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//
//    @Autowired
//    AuthorRepository authorRepository;
//
//
//    /**
//     * 测试 example查询
//     */
//    @Test
//    public void testExample(){
//
//         Author author=new Author();
//         author.setAges(17);
//         author.setEmail("test@gmail.com");
//         author.setNames("路飞");
//
//
//        Author author1=new Author();
//        author1.setAges(17);
//        author1.setEmail("test1@gmail.com");
//        author1.setNames("索隆");
//
//        List<Author> list=new ArrayList<>();
//        list.add(author);
//        list.add(author1);
//
//        // authorRepository.saveAll(list.iterator());
//
//
//    }
//}
