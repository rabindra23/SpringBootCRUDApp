package com.masai.app.springboot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Min;

@Entity
public class Teacher {

	@Id
	@Min(1)
	private int tId;
	private String name;
	@ManyToMany
	private List<Course> courses;
	
	public Teacher() {}

	public Teacher(int tId, String name, List<Course> courses) {
		super();
		this.tId = tId;
		this.name = name;
		this.courses = courses;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
