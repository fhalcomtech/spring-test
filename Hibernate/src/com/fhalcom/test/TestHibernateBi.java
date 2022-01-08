package com.fhalcom.test;


import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import com.fhalcom.entity.*;

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
        .addAnnotatedClass(Order.class)
        .buildSessionFactory();

        Session session = sessionFactory.openSession();
        
try{

    Client c = new Client();
    c.setName("Fidel Alembert");
    c.setLastname("Lascano Valencia");
    c.setAddress("Conauto" + (new Random()).nextLong());
    
    ClientDetail cd = new ClientDetail();
    cd.setComment("Comentario" + (new Random()).nextLong());
    cd.setPhone("09239705001");
    cd.setWeb("fidel.test."+(new Random()).nextLong()+".com");
    //cd.setClient(c);
    c.setClientDetail(cd);
    
    session.beginTransaction();
    session.save(c);
    session.getTransaction().commit();
    
    session.beginTransaction();
    ClientDetail cs = session.get(ClientDetail.class, 30L);
    session.getTransaction().commit();
    System.out.println(cs.toString());
    System.out.println(cs.getClient().toString());

    session.beginTransaction();
    session.delete(cs);
    session.getTransaction().commit();

    session.beginTransaction();
    List<Client> clients = session.createQuery("from Client c").getResultList();
    session.getTransaction().commit();
    for(Client client:clients) System.out.println(client.toString());
    session.close();
}catch(Exception e) {e.printStackTrace();}
finally{}
    
}
}
