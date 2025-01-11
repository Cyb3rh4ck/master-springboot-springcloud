package com.codigojava.springboot.learnspringboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigojava.springboot.learnspringboot.models.Course;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "codigoJava"),
				new Course(2, "Learn DevOps", "codigoJava")
				);
	}

}
