package com.yty.dao;

import com.yty.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student row);

    int insertSelective(Student row);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student row);

    int updateByPrimaryKey(Student row);
}