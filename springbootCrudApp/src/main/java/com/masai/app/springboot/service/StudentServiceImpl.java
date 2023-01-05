package com.masai.app.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.springboot.entity.Student;
import com.masai.app.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Student createStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		Student st = repository.findById(id).get();
		repository.delete(st);
		return;
	}

}
