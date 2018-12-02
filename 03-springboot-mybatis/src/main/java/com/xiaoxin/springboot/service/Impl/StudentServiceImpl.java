package com.xiaoxin.springboot.service.Impl;

import com.xiaoxin.springboot.mapper.StudentMapper;
import com.xiaoxin.springboot.model.Student;
import com.xiaoxin.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAllStudent();
    }


   // @Transactional
    @Override
    public int update(){
            Student student = new Student();
            student.setSno("001");
            student.setSname("小新新啊啊啊啊");
            student.setAge(25);
        int update = studentMapper.updateByPrimaryKeySelective(student);
        System.out.println("更新的结果："+update);

      //  int a = 10/0;
        return update;
    }

}
