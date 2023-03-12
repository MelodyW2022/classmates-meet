package org.melodywong.classmatesmeet.service;
import org.melodywong.classmatesmeet.model.Student;
import java.util.*;

public interface StudentService {
    List<Student> getAllStudents();
    void saveStudent(Student student);
    Student getStudentById(long id);
}
