package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        return "Hello My Three SpringBoot";
    }
}
