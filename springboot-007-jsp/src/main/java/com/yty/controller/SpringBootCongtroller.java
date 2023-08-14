package com.yty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Controller
public class SpringBootCongtroller {
    @RequestMapping(value = "/springBoot/jsp")
    public String jsp(Model model){
        model.addAttribute("data", "using jsp at frontend");
        return "index";
    }
}
