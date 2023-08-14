package com.yty.config;

import com.yty.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 * Spring configuration class
 **/
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml", "classpath:beans.xml"})
@PropertySource(value = {"classpath:config.properties"})
@ComponentScan(basePackages = {"com.yty.vo"})
public class SpringConfig {
    /**
     * equals to Spring xml file
     * create a method
     * use @Bean annotation
     * the object will be injected to the IOC
     * if didn't make sure the object id, it will be method's name
     * else can use @Bean("id")
     */
    @Bean
    public Student createStudentBean(){
        Student student = new Student();
        student.setName("wjs");
        student.setAge(24);
        student.setSex("male");
        return student;
    }

    @Bean("lyStudent")
    public Student createStudentBean2(){
        Student student = new Student();
        student.setName("ly");
        student.setAge(24);
        student.setSex("male");
        return student;
    }

}
