package com.masai.app.springboot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Min;

@Entity
public class Student {

	@Id
	@Min(1)
	private int stuId;
	private String sname;
	
	@ManyToMany
	private List<Course> courses;
	
	public Student() {}

	public Student(int stuId, String sname, List<Course> courses) {
		super();
		this.stuId = stuId;
		this.sname = sname;
		this.courses = courses;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
}
