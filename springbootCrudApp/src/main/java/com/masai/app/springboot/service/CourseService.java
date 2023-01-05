package com.masai.app.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.springboot.entity.Course;
import com.masai.app.springboot.entity.Syllabus;

@Service
public interface CourseService {

	List<Course> getAllCourses();
	Course getCourseById(int id);
	Course createCourse(Course course);
	Course updateCourse(Course course);
	void deleteCourse(int id);
	Syllabus getCourseSyllabus(int id);
	Syllabus createCourseSyllabus(Syllabus syllabus);
}
