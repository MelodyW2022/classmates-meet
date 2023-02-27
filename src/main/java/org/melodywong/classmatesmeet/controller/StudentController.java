package org.melodywong.classmatesmeet.controller;

import org.melodywong.classmatesmeet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.melodywong.classmatesmeet.model.Student;
import java.util.*;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    //get all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
