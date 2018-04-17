package com.example.springboot.ucc;

import com.example.springboot.model.db1.Person;
import com.example.springboot.model.db2.Department;
import com.example.springboot.service.DepartmentService;
import com.example.springboot.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yao.Jie
 * @description ${DESCRIPTION}
 * @create 2018-04-17 16:37
 **/

@Slf4j
@Service
public class PersonUccServiceImpl  implements  PersonUccService{

    @Autowired
    PersonService personService;


    @Autowired
    DepartmentService departmentService;


    /**
     *
     * 组合服务
     *
     * @description
     *
     *  测试UCC组合多个Service，并测试事务控制能力(提交、底部异常回滚、中部异常回滚)
     *
     *  1.默认情况下 readOnly的值是false，如果方法只是查询而不涉及到增删改的事务的话，可以将readOnly的值设置为true
     *
     *  2.根据返回异常类型进行回滚，首先捕获RuntimeException，若未捕获到则捕获异常父类
     *
     *  3.事务隔离级别(isolation)采用默认(read-commit)，与数据库一般默认级别保持一致
     *
     *  4.事务传播级别(propagation)采用默认(REQUIRED)，没有事务则开启事务，有事务则加入当前事务
     *
     */
    @Transactional(rollbackForClassName={"RuntimeException","Exception"},isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    @Override
    public void savePersonAndDepts() {

        Person person= new Person();

        person.setCity("北京1");

        person.setName("朝阳00");

        personService.savePerson(person);


        Department department=new Department();
        department.setName("海军士兵");

        departmentService.saveDepartment(department);



    }
}
