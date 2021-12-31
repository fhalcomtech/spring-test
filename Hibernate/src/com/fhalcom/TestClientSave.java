package com.fhalcom;

import com.fhalcom.entity.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TestClientSave {
    public static void main(String[] args)    
    {
        SessionFactory sessionFactory = new Configuration().configure("/com/fhalcom/config/hibernate/hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        try
        {
            // Save a new client
            String name         = "Rosa";
            String lastname     = "Lascano";
            String address      = "Perimetral";
            Client client       = new Client(name, lastname, address);
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
            System.out.println("Se registro en usuario:" + client.toString());
            
            // Read a client row
            session.beginTransaction();
            System.out.println("Se creo el id: " + client.getId());
            Client getUser = session.get(Client.class, client.getId());
            session.getTransaction().commit();
            System.out.println("You get a client: " + getUser.toString());  
        }
        finally{session.close();}
    }
}
