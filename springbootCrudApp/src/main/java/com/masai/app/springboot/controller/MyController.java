package com.masai.app.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.springboot.entity.Course;
import com.masai.app.springboot.entity.Student;
import com.masai.app.springboot.entity.Syllabus;
import com.masai.app.springboot.service.CourseService;
import com.masai.app.springboot.service.StudentService;
import com.masai.app.springboot.service.SyllabusService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("myapp/api")
public class MyController {

	@Autowired
	StudentService service;
	@Autowired
	CourseService courseservice;
	//SyllabusService syservice;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id){
		return service.getStudentById(id);
	}
	
	@PostMapping("/students")
	public ResponseEntity<?> createStudent(@Valid @RequestBody Student student) {
		Student students = service.createStudent(student);
		return new ResponseEntity<Student>(students,HttpStatus.CREATED);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@Valid @RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		return courseservice.getAllCourses();
	}
	
	@PostMapping("/courses")
	public ResponseEntity<?> createCourse(@Valid @RequestBody Course course) {
		Course courses = courseservice.createCourse(course);
		return new ResponseEntity<Course>(courses,HttpStatus.CREATED);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return courseservice.updateCourse(course);
	}
	
	@GetMapping("/course/{id}/syllabus")
	public Syllabus getCourseSyllabus(@PathVariable int id) {
		return courseservice.getCourseSyllabus(id);
	}
	
	@PostMapping("/course/{id}/syllabus")
	public ResponseEntity<?> createCourseSyllabus(@Valid @PathVariable int id,@RequestBody Syllabus syllabus) {
		Syllabus syll = courseservice.createCourseSyllabus(syllabus);
		return new ResponseEntity<Syllabus>(syll,HttpStatus.CREATED);
	}
	
	
}
