package com.yty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class BootController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "go to user/account";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin(){
        return "go to /user/login";
    }

}
