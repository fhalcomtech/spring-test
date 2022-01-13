package com.fhalcom.test;

import com.fhalcom.entity.Client;
import com.fhalcom.entity.ClientDetail;
import com.fhalcom.entity.Order;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerAndLazy {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
        .configure("/com/fhalcom/config/hibernate/hibernate.cfg.xml")
        .addAnnotatedClass(Order.class)
        .addAnnotatedClass(Client.class)
        .addAnnotatedClass(ClientDetail.class)
        .buildSessionFactory();

        Session s = sf.openSession();
        s.beginTransaction();
        Client c = s.get(Client.class,13L);
        s.getTransaction().commit();
        s.close();
        c.print();        

    }
}
