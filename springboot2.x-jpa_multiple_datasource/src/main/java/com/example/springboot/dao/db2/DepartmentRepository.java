package com.example.springboot.dao.db2;

import com.example.springboot.model.db2.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{
}