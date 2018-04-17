package com.example.springboot.service;

import java.util.List;

import com.example.springboot.dao.db1.PersonRepository;
import com.example.springboot.model.db1.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {
	@Autowired
    PersonRepository personRepo;

	public List<Person> getAllPersons() {
		return (List<Person>) personRepo.findAll();
	}

	public Person savePerson(Person person) {
		return personRepo.save(person);
	}
}