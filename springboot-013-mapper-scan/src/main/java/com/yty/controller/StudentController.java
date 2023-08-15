package com.yty.controller;

import com.yty.domain.Student;
import com.yty.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private StudentService studentService;
    @RequestMapping("/query")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return "id: " + id + "student info:" + student;
    }
}
