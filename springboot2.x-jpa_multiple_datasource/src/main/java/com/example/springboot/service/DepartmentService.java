package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dao.db2.DepartmentRepository;
import com.example.springboot.model.db2.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Slf4j
@Service
public class DepartmentService {
	@Autowired
    DepartmentRepository deptRepo;

	public List<Department> getAllDepartment() {
		return (List<Department>) deptRepo.findAll();
	}

	public Department saveDepartment(Department dept) {

	    try{

            return deptRepo.save(dept);

        }catch (RuntimeException e){


            throw  new RuntimeException("事务回滚");
        }



	}
}
