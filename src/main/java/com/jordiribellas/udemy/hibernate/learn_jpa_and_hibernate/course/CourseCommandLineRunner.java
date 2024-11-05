package com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Spring Boot Fundamentals new JPA", "Jordi Ribellas"));
		repository.save(new Course(2, "Hibernate Fundamentals new JPA", "Jordi Ribellas"));
		repository.save(new Course(3, "Docker Fundamentals new JPA", "Jordi Ribellas"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
	}

}
