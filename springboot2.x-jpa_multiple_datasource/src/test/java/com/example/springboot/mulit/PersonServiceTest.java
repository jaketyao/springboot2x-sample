package com.example.springboot.mulit;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

import com.example.springboot.model.db1.Person;
import com.example.springboot.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-17 11:08
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {


    @Autowired
    PersonService personService;

    /**
     *
     * Method: getAllPersons()
     *
     */
    @Test
    public void testGetAllPersons() throws Exception {


        personService.getAllPersons().forEach(System.out::println);
    }

    /**
     *
     * Method: savePerson(Person person)
     *
     */
    @Test
    public void testSavePerson() throws Exception {

        Person person =new Person();

        person.setName("路飞");

        person.setCity("东海");

        personService.savePerson(person);





    }
}
