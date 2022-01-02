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

    public Client(String name, String lastname, String address, ClientDetail clientDetail)
    {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.clientDetail = clientDetail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastname;

    @Column(name="address")
    private String address;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    private ClientDetail clientDetail;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public void setClientDetail(ClientDetail clientDetail) {this.clientDetail = clientDetail;}
    public ClientDetail getClientDetail() {return clientDetail;}

    @Override
    public String toString() {
        return "{"
            + "\"id\"       :\""+this.id +       "\","
            + "\"name\"     :\""+this.name +     "\","
            + "\"lastname\" :\""+this.lastname + "\","
            + "\"address\"  :\""+this.address +   "\""
            + "\"client_detail\"  :\""+this.clientDetail.toString() +   "\""
        +"}";
    }

}
