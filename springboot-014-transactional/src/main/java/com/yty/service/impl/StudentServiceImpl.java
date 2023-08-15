package com.yty.service.impl;

import com.yty.dao.StudentMapper;
import com.yty.model.Student;
import com.yty.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.beans.Transient;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     * 默认数据库隔离级别，required传播行为，超时时间-1
     * 出现异常时回滚
     * @param student
     * @return
     */
    @Transactional
    @Override
    public int addStudent(Student student) throws Exception {
        System.out.println("add student");
        int rows = studentMapper.insert(student);
        System.out.println("execute sql");
//        int m = 10 / 0;
        return rows;
    }
}
