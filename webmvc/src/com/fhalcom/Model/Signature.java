package com.fhalcom.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Signature
 {
    private String code;
    
    public String getCode() {
        return code;
    }
    
    
    public void setCode(String code) {
        this.code = code;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Signature(String code, String name)
    {
        this.code = code;
        this.name=name;
    }


    public static List<Signature> getSignatures()
    {
        List<Signature> response = new ArrayList<Signature>();
        response.add(new Signature("MAT", "Matematicas"));
        response.add(new Signature("GEO", "Geografia"));
        response.add(new Signature("FIS", "Fisica"));
        return response;
    }
}