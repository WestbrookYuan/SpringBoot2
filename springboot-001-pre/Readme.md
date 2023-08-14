# Spring Config

## 可以使用xml文件或者配置类进行配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="student" class="com.yty.vo.Student">
        <property name="name" value="syb"/>
        <property name="sex" value="male"/>
        <property name="age" value="24"/>
    </bean>
</beans>
```

```java
package com.yty.config;

import com.yty.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 * Spring configuration class
 **/
@Configuration
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

```



## @ImportResource

1. 导入其他的xml配置文件，等于在xml中导入另一个xml文件

```java
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml"})
```

## @PropertyResource

```properties
tiger.name=xcj
tiger.age=6
```

```java
package com.yty.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Component("tiger")
public class Tiger {
    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private Integer age;

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

***!!! JDK 17请使用Spring 5.3.19***