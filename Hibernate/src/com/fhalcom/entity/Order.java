package com.fhalcom.entity;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="pedido", schema="test_rel")
public class Order {

    public Order(){};
    public Order(GregorianCalendar create, String pay_type, Client c){
        this.dateCreate = create;
        this.payType = pay_type;
        this.client = c;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    Long id;
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    @Column(name="DATE_CREATE")
    GregorianCalendar dateCreate;
    public GregorianCalendar getDateCreate() {return dateCreate;}
    public void setDateCreate(GregorianCalendar dateCreate) {this.dateCreate = dateCreate;}
    
    @Column(name="PAY_TYPE")
    String payType;
    public String getPayType() {return payType;}
    public void setPayType(String payType) {this.payType = payType;}

    @ManyToOne(cascade = CascadeType.ALL/*{CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}*/)
    @JoinColumn(name="CLIENT_ID", referencedColumnName = "id")
    Client client;
    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}


    @Override
    public String toString() {
        return "{"
            + "\"id\"       :\""+this.id +       "\","
            + "\"dateCreate\"     :\""+this.dateCreate +     "\","
            + "\"payType\" :\""+this.payType + "\","
            + "\"client\"  :\""+this.client.toString() +   "\""
        +"}";
    }
}
