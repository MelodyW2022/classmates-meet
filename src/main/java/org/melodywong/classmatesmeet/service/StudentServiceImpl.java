package org.melodywong.classmatesmeet.service;


import org.melodywong.classmatesmeet.model.Student;
import org.melodywong.classmatesmeet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
