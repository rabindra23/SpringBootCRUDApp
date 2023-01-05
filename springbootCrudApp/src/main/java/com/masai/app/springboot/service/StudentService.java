package com.masai.app.springboot.service;

import java.util.List;

import com.masai.app.springboot.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
    Student getStudentById(int id);
    Student createStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(int id);
}
