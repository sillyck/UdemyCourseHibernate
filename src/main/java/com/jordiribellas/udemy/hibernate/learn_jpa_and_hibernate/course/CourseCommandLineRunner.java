package com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Spring Boot Fundamentals new JPA", "Jordi Ribellas"));
		repository.insert(new Course(2, "Hibernate Fundamentals new JPA", "Jordi Ribellas"));
		repository.insert(new Course(3, "Docker Fundamentals new JPA", "Jordi Ribellas"));
		
		
		repository.deleteById(2);
		
		System.out.println(repository.selectById(1));
		System.out.println(repository.selectById(3));
		
	}

}
