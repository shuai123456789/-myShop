package com.example.controller;

import com.example.mapper.TZxjcDxwdMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private TZxjcDxwdMapper tZxjcDxwdMapper;
    @Autowired
    private StudentService studentService;

    @GetMapping("/query")
    public List<Student> query(){
        return studentService.query();
    }
}

