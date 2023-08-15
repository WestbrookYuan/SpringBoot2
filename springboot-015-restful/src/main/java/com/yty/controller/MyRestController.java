package com.yty.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@RestController
public class MyRestController {
    /**
     * search id=10001
     * @Pathvariable 获取url中的数据。属性：Value，放在型参前面，路径变量名
     * @return
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable(value = "stuId") Integer id){
        return "id is : " + id;
    }

    @PostMapping("/student/{name}/{age}" )
    public String createStudent(@PathVariable("name") String name,
                                @PathVariable("age") Integer age){
        return "create a student: " + name + " age: " + age;
    }

    @PutMapping("/student/{id}/{age}" )
    public String updateStudent( Integer id,
                                 Integer age){
        return "update a student: " + id + " age: " + age;
    }

    @DeleteMapping("/student/{id}" )
    public String deleteStudent(Integer id){
        return "delete a student: " + id;
    }

    @DeleteMapping("/student/test")
    public String test(){
        return "execute student test, using delete";
    }
}
