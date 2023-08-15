package com.yty.service.impl;

import com.yty.dao.StudentMapper;
import com.yty.domain.Student;
import com.yty.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentMapper.selectById(id);
        return student;
    }
}
