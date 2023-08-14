package com.yty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class HelloSpringBoot {
    @RequestMapping("/helloSpringBoot")
    @ResponseBody
    public String helloSpringBoot(){
        return "hello springBoot";
    }
}
