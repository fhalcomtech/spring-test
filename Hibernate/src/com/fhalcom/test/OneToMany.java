package com.fhalcom.test;


import java.util.GregorianCalendar;
import java.util.Random;

import com.fhalcom.entity.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToMany {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
        .configure("/com/fhalcom/config/hibernate/hibernate.cfg.xml")
        .addAnnotatedClass(Client.class)
        .addAnnotatedClass(Order.class)
        .addAnnotatedClass(ClientDetail.class)
        .buildSessionFactory();

        Session s = sf.openSession();
        Client c = new Client();
        c.setName("Huguito_");
        c.setLastname("Lascano");
        c.setAddress("Casa"+ (new Random()).nextLong());

        ClientDetail cd = new ClientDetail();
        cd.setWeb("www.huguito."+(new Random()).nextLong()+".com");
        cd.setPhone("123456");
        cd.setComment("Huguito Coment");
        cd.setClient(c);
        c.setClientDetail(cd);

        Order o1 = new Order();
        o1.setDateCreate((new GregorianCalendar()));
        o1.setPayType("Contado");
        c.addOrder(o1);

        Order o2 = new Order();
        o2.setDateCreate((new GregorianCalendar()));
        o2.setPayType("Credito");
        c.addOrder(o2);

        s.beginTransaction();
        s.save(c);
        s.getTransaction().commit();
        s.close();


        
        
    }
}
