package com.masai.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.springboot.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
