package com.jda.jira.Examples.hteoas.service;

import java.util.List;
import java.util.Optional;

import com.jda.jira.Examples.hteoas.model.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student getStudent(int id);
	

}
