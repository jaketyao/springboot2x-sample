//package com.example.springboot;
//import static org.assertj.core.api.Assertions.assertThat;
//
//import com.example.springboot.dao.BooksRepository;
//import com.example.springboot.model.Books;
//import com.example.springboot.service.BooksService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//
//public class SpringbootApplicationTests {
//
//
//
//     @Autowired
//    BooksService booksService;
//
//
//
//	@Test
//	public void insert() {
//
//	    Books books=new Books();
//	    books.setAuthor("尾田荣一郎");
//	    books.setBookName("海贼王");
//	    books.setCategory("漫画");
//	    books.setPrice(100.99);
//	    books.setTiter("路飞");
//
//	    booksService.save(books);
//
//	}
//
//
//}
