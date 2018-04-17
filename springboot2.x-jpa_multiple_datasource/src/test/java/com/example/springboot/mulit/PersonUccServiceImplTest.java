package com.example.springboot.mulit;

import com.example.springboot.ucc.PersonUccService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-17 16:48
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonUccServiceImplTest {

    @Autowired
    PersonUccService personUccService;
    /**
     *
     * Method: savePersonAndDepts()
     *
     */
    @Test
    public void testSavePersonAndDepts() throws Exception {

        personUccService.savePersonAndDepts();


    }

}
