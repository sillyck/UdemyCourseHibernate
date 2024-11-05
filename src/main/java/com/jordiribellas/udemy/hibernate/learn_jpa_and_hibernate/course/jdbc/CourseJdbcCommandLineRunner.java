package com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Spring Boot Fundamentals new", "Jordi Ribellas"));
		repository.insert(new Course(2, "Hibernate Fundamentals new", "Jordi Ribellas"));
		repository.insert(new Course(3, "Docker Fundamentals new", "Jordi Ribellas"));
		
		
		repository.deleteById(2);
		
	}

}
