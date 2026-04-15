
	package com.education.student.service;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.education.student.Entity.Student;
	import com.education.student.repository.StudentRepo;

	@Service
	public class StudentServ {

	    @Autowired
	    private StudentRepo repo;

	    public Student addStudent(Student s) {
	        return repo.save(s);
	    }

	    public List<Student> getAll() {
	        return repo.findAll();
	    }

	    public void delete(int id) {
	        repo.deleteById(id);
	    }
	}


