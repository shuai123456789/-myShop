package com.example.service.impl;

import com.example.mapper.TZxjcDxwdMapper;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private TZxjcDxwdMapper tZxjcDxwdMapper;

    @Override
    public List<Student> query() {
        //wszyyds
        return tZxjcDxwdMapper.queryStu();
    }
}
