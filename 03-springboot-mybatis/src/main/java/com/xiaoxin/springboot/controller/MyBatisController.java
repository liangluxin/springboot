package com.xiaoxin.springboot.controller;

import com.xiaoxin.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBatisController {

    @Autowired
    private StudentService studentService;
    @GetMapping("/boot/students")
    public Object students() {
        return studentService.getAllStudent();
    }

    @GetMapping("/boot/update")
    public int update() {
        return studentService.update();
    }
}
