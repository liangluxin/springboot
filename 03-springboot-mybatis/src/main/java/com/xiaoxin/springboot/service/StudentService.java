package com.xiaoxin.springboot.service;

import com.xiaoxin.springboot.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public int update();
}
