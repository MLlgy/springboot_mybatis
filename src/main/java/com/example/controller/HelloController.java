package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 17-3-15 下午12:54
 */

@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "Hello SpringBoot";
    }
}
