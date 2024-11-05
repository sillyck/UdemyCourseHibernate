package com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="course") //We don't need it because the name of the class and the name of the table are the exact same
public class Course {

	@Id
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "author")
	private String author;
}
