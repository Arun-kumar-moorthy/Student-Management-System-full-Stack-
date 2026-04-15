package com.education.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.student.Entity.Student;



	public interface StudentRepo extends JpaRepository<Student, Integer> {
	}

