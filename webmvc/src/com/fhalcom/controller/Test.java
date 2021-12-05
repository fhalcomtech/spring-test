package com.fhalcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "test")
public class Test
{
    @RequestMapping
    public String requestTest(){return "test2";}
}