package com.fhalcom.entity;

import java.util.ArrayList;
import java.util.List;

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
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    @Column(name="name")
    private String name;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Column(name="lastname")
    private String lastname;
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    
    @Column(name="address")
    private String address;
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="client_detail_id")
    private ClientDetail clientDetail;
    
    public void setClientDetail(ClientDetail clientDetail) {this.clientDetail = clientDetail;}
    public ClientDetail getClientDetail() {return clientDetail;}

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client", cascade = CascadeType.ALL/*{CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}*/)
    List<Order> orders;

    public void addOrder(Order o){
        if(this.orders == null) this.orders = new ArrayList<Order>();
        this.orders.add(o);
        o.setClient(this);
    }

    @Override
    public String toString() {
        return "{"
            + "\"id\"       :\""+this.id +       "\","
            + "\"name\"     :\""+this.name +     "\","
            + "\"lastname\" :\""+this.lastname + "\","
            + "\"address\"  :\""+this.address +   "\""
            + "\"client_detail\"  :\""+((this.clientDetail!=null)?this.clientDetail.toString():"" )+   "\""
        +"}";
    }

    public void print()
    {
        System.out.println(toString());
        if(orders!=null)
        {
            System.out.println("Printing orders\n");
            for(Order o: this.orders){System.out.println(o.toString()+"\n");}
        }
        else System.err.println("There are not orders");

    }



}
