package com.education.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.education.student.Entity.Student;
import com.education.student.repository.StudentRepo;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentControl {

    @Autowired
    private StudentRepo repo;

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Student add(@RequestBody Student s) {
        return repo.save(s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        repo.deleteById(id);
    }
    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student s) {
        Student existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(s.getName());
            existing.setAge(s.getAge());
            existing.setMarks(s.getMarks());
            return repo.save(existing);
        }
        return null;
    }
    @GetMapping("/{id}")
    public Student getOne(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }
}