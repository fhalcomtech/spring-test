package com.fhalcom.controller;

import com.fhalcom.Model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="modcont")
public class ModelController {

    @Autowired
    private Student student;

    @RequestMapping(path="alumform")
    public String alumnform(Model model)
    {
        model.addAttribute("userinfo", student);
        return "stud/stud";
    }

    @RequestMapping(path="alumpro")
    public String processStudent(@ModelAttribute("userinfo") Student stud, Model model)
    {
        model.addAttribute("userinfo",stud);
        return "stud/studpro";
    }

}
