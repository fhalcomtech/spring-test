package com.fhalcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2 {
    @RequestMapping("test2")
    public String getTest2(){return "test2";}
}
