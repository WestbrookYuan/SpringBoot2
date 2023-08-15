package com.yty.dao;

import com.yty.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Mapper
public interface StudentMapper {
    Student selectById(@Param("id") Integer id);
}
