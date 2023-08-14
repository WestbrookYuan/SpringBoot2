package com.yty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return "hello SpringBoot";
    }
}
