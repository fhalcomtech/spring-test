package com.fhalcom.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    public Client(){};

    public Client(String name, String lastname, String address)
    {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastname;

    @Column(name="address")
    private String address;


    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    @Override
    public String toString() {
        return "{"
            + "\"id\"       :\""+this.id +       "\","
            + "\"name\"     :\""+this.name +     "\","
            + "\"lastname\" :\""+this.lastname + "\","
            + "\"address\"  :\""+this.address +   "\""
        +"}";
    }

}
