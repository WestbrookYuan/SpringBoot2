package com.yty;

import com.yty.config.SpringConfig;
import com.yty.vo.Cat;
import com.yty.vo.Student;
import com.yty.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
public class Test01 {

    /**
     * using xml as configuration
     */
    @Test
    public void testBeanXml(){
        String configFile = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configFile);
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testConfigurationClass(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = applicationContext.getBean("createStudentBean", Student.class);
        System.out.println(student);
        Student student1 = applicationContext.getBean("lyStudent", Student.class);
        System.out.println(student1);
    }

    @Test
    public void testImportResource(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat myCat = applicationContext.getBean("myCat", Cat.class);
        System.out.println(myCat);
    }
    @Test
    public void testPropertyResource(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = applicationContext.getBean("tiger", Tiger.class);
        System.out.println(tiger);
    }
}
