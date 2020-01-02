package com.jda.jira.Examples.hteoas.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jda.jira.Examples.hteoas.model.Student;
import com.jda.jira.Examples.hteoas.repository.SttudentRepository;
import com.jda.jira.Examples.hteoas.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	SttudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(int id) {
		return studentRepository.findById(id);
	}
	
	

}
