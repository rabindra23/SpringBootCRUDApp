package com.masai.app.springboot.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;

@Entity
public class Course {

	@Id
	@Min(1)
	private int cId;
	private String cname;
	@OneToOne
	private Syllabus syllabus;
	@ManyToMany
	private List<Student> students;
	
	public Course() {}

	public Course(int cId, String cname, Syllabus syllabus, List<Student> students) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.syllabus = syllabus;
		this.students = students;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Syllabus getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(Syllabus syllabus) {
		this.syllabus = syllabus;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
