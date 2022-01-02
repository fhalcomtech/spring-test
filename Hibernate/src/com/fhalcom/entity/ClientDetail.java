package com.fhalcom.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="client_detail", schema="test_rel")
public class ClientDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="web")
    private String web;

    @Column(name="phone")
    private String phone;

    @Column(name="comment")
    private String comment;

    public ClientDetail(){}

    public ClientDetail(String web, String phone, String comment)
    {
        this.web = web;
        this.phone=phone;
        this.comment = comment;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getWeb() {return web;}
    public void setWeb(String web) {this.web = web;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getComment() {return comment;}
    public void setComment(String comment) {this.comment = comment;}
    
    public String toString() {
        return "{"
            + "\"id\"       :\""+this.id +       "\","
            + "\"web\"     :\""+this.web +     "\","
            + "\"phone\" :\""+this.phone + "\","
            + "\"comment\"  :\""+this.comment +   "\""
        +"}";
    }
}
