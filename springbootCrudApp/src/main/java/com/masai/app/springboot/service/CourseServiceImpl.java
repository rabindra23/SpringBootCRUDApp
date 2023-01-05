package com.masai.app.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.springboot.entity.Course;
import com.masai.app.springboot.entity.Syllabus;
import com.masai.app.springboot.repository.CourseRepository;
import com.masai.app.springboot.repository.SyllabusRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courserepository;
	@Autowired
	SyllabusRepository syrepository;
	
	

	public CourseServiceImpl(CourseRepository courserepository, SyllabusRepository syrepository) {
		super();
		this.courserepository = courserepository;
		this.syrepository = syrepository;
	}

	@Override
	public List<Course> getAllCourses() {
		return courserepository.findAll();
	}

	@Override
	public Course getCourseById(int id) {
		return courserepository.findById(id).get();
	}

	@Override
	public Course createCourse(Course course) {
		return courserepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return courserepository.save(course);
	}

	@Override
	public void deleteCourse(int id) {
		Course course = courserepository.findById(id).get();
		courserepository.delete(course);
		return;
		

	}

	@Override
	public Syllabus getCourseSyllabus(int id) {
		return courserepository.findById(id).get().getSyllabus();
	}

	@Override
	public Syllabus createCourseSyllabus(Syllabus syllabus) {
		return syrepository.save(syllabus);
	}

}
