package com.fhalcom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(path = "userresponse2")
    public String userFormResponse2(HttpServletRequest request, Model model)
    {
        String username = request.getParameter("username");
        String result = "Hola" + username + " eres el mejor en todo";
        model.addAttribute("fhalcommsg", result);
        return "user/userresponse";
    }


    // Usando request param 
    @RequestMapping(path = "usrresp")
    public String useReqParam(@RequestParam("username") String username, Model model)
    {

        String result = "Hola" + username + " eres el mejor en todo \n"
        + " Respondiendo desde un request param";
        
        model.addAttribute("fhalcommsg", result);
        return "user/userresponse"; 
    }

    
}
