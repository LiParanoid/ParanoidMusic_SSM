package com.rytong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Paranoid
 * @create 2018-12-27 21:56
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "你得到我啦";
    }
}
