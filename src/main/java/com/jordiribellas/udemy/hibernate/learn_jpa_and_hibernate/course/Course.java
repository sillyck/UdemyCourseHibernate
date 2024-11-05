package com.jordiribellas.udemy.hibernate.learn_jpa_and_hibernate.course;

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
public class Course {

	private long id;
	private String name;
	private String author;
}
