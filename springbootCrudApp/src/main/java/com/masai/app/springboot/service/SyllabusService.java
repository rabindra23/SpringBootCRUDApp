package com.masai.app.springboot.service;

import java.util.List;

import com.masai.app.springboot.entity.Syllabus;

public interface SyllabusService {

	public Syllabus getSyllabus(int id);
	public Syllabus createSyllabus(Syllabus syllabus);
}
