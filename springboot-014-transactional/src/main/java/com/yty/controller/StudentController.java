package com.yty.controller;

import com.yty.model.Student;
import com.yty.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class StudentController {
    @Resource
    StudentService studentService;

    @RequestMapping("/insert")
    @ResponseBody
    public int insertStudent(String name, Integer age) throws Exception {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        int rows = studentService.addStudent(student);
        return rows;
    }
}
