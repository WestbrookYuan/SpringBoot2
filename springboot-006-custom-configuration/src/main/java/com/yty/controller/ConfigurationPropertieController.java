package com.yty.controller;

import com.yty.config.SchoolInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class ConfigurationPropertieController {

    @Resource
    private SchoolInfo schoolInfo;

    @RequestMapping("/school")
    @ResponseBody
    public String getSchoolInfo(){
        return schoolInfo.toString();
    }


}
