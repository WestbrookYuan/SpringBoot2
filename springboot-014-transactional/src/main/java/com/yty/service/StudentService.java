package com.yty.service;

import com.yty.model.Student;
import org.springframework.stereotype.Service;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
public interface StudentService {
    int addStudent(Student student) throws Exception;
}
