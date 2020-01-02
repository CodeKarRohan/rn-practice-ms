package com.jda.jira.Examples.hteoas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jda.jira.Examples.hteoas.serviceimpl.StudentServiceImpl;
import com.jda.jira.Examples.hteoas.Exception.StudentNotFoundException;
import com.jda.jira.Examples.hteoas.model.Student;

@RestController
@RequestMapping("/api/v1/students")
public class StudentContoller {

	@Autowired
	StudentServiceImpl studentServiceImpl;

	@GetMapping(path = "/id/{id}", produces = "application/json")
	public Resource retrieveStudent(@PathVariable int id) throws StudentNotFoundException {

		System.out.println(studentServiceImpl.toString());
		Student student = studentServiceImpl.getStudent(id);
		System.out.println("here is the data " + student);
		
		if (null == student)
			throw new StudentNotFoundException("id-" + id);
		
		Resource<Student> resource = new Resource<Student>(student);
		ControllerLinkBuilder linkTo = ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).retrieveAllStudents());
		resource.add(linkTo.withRel("all-students"));
		ControllerLinkBuilder linkTo1 = ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).retrieveAllStdCourse());
		resource.add(linkTo1.withRel("all-course"));
		return resource;
	}

	@GetMapping(path = "/", produces = "application/json")
	public Resources retrieveAllStudents() throws StudentNotFoundException {
		List<Student> student = studentServiceImpl.getAllStudent();
		if (null == student || student.size() == 0)
			throw new StudentNotFoundException("rohan");
		Resources resource = new Resources(student);
		return resource;
	}

	@GetMapping(path = "/course", produces = "application/json")
	public Resources retrieveAllStdCourse() throws StudentNotFoundException {
		List<Student> student = studentServiceImpl.getAllStudent();
		if (null == student || student.size() == 0)
			throw new StudentNotFoundException("rohan");
		Resources resource = new Resources(student);
		return resource;
	}
	
	//@PostMapping()

}
