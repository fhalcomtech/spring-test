package com.fhalcom;


import com.fhalcom.entity.Client;
import com.fhalcom.entity.ClientDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionImpl;

public class TestHibernateBi {
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = new Configuration()
        .configure("/com/fhalcom/config/hibernate/hibernate.cfg.xml")
        .addAnnotatedClass(Client.class)
        .addAnnotatedClass(ClientDetail.class)
        .buildSessionFactory();

        Session session = sessionFactory.openSession();
        

        Client c = new Client();
        c.setName("Fidel Alembert");
        c.setLastname("Lascano Valencia");
        c.setAddress("Conauto");
        
        ClientDetail cd = new ClientDetail();
        cd.setComment("Comentario 1");
        cd.setPhone("09239705001");
        cd.setWeb("fidel.test.com");
        //cd.setClient(c);
        c.setClientDetail(cd);

        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();

        session.beginTransaction();
        ClientDetail cs = session.get(ClientDetail.class, 25L);
        session.getTransaction().commit();
        System.out.println(cs.toString());
        System.out.println(cs.getClient().toString());
        session.close();

    }
}
