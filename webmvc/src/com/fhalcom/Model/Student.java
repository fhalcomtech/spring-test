package com.fhalcom.Model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Component("Student")
public class Student {
    @NotNull
    @Size(min=2, message="Minimo 2 caracteres")
    private String name;
    private Integer edad;
    private String email;
    private List<Signature> signatures;
    private String favorite;
    private List<String> hobbies;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public List<Signature> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<Signature> signatures) {
        this.signatures = signatures;
    }

    public Integer getEdad() {return edad;}
    public void setEdad(Integer edad) {this.edad = edad;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


}
