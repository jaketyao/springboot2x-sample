package com.example.springboot.mulit;

import com.example.springboot.model.db2.Department;
import com.example.springboot.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springboot.model.db1.Person;
import com.example.springboot.service.PersonService;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-17 11:08
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceTest {


    @Autowired
    DepartmentService departmentService;


    @Test
    public void testgetAllDepartment() throws Exception {


        departmentService.getAllDepartment().forEach(System.out::println);
    }


    @Test
    public void testSaveDepartment() throws Exception {


        Department department=new Department();
         department.setName("海军");

        departmentService.saveDepartment(department);





    }
}
