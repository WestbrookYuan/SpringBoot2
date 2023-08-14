package com.yty.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class BootController {
    @Value("${environment.country}")
    private String country;
    @Value("${environment.city}")
    private String city;
    @Value("${environment.address}")
    private String address;

    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return country+" "+city+" "+address;
    }
}
