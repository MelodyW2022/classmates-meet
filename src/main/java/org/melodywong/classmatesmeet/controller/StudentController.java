package org.melodywong.classmatesmeet.controller;


import org.melodywong.classmatesmeet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    //display list of students
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listStudents", studentService.getAllStudents());
        return "index";
    }
}
