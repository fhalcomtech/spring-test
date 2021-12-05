package com.fhalcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "form")
public class FormController {
    @RequestMapping(path = "userform")
    public String userFormControl(){
        return "user/userform";
    }

    @RequestMapping(path = "userresponse")
    public String userFormResponse(){
        return "user/userresponse";
    }

}
