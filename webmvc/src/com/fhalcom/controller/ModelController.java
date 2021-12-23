package com.fhalcom.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import com.fhalcom.Model.Signature;
import com.fhalcom.Model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping(path="modcont")
public class ModelController {

    @Autowired
    private Student student;

    
    @InitBinder
    public void AlumInitBinder(WebDataBinder binder)
    {
        StringTrimmerEditor trimString =  new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trimString);
    }

    @RequestMapping(path="alumform")
    public String alumnform(Model model)
    {
        student.setSignatures(Signature.getSignatures());
        student.setHobbies(new ArrayList<String>());
        model.addAttribute("userinfo", student);
        return "stud/stud";
    }

    @RequestMapping(path="alumpro")
    public String processStudent(@Valid @ModelAttribute("userinfo") Student stud, BindingResult bindingResult, Model model)
    {
        // model.addAttribute("userinfo",stud);
        if(bindingResult.hasErrors()) return "stud/stud";
        else return "stud/studpro";
    }

}
