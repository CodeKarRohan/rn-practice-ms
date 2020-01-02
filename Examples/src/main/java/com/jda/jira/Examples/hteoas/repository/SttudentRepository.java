package com.jda.jira.Examples.hteoas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import com.jda.jira.Examples.hteoas.model.Student;

@Component
public interface SttudentRepository extends Repository<Student, Integer>{

	List<Student> findAll();
	Student findById(int id);
	List<Student> findByFirstName(String firstName);
	List<Student> findByLastName(String lastName);

	

	
}
