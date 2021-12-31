package com.fhalcom;

import java.util.List;

import com.fhalcom.entity.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSelect {
    public static void main(String[] args)
    {
        SessionFactory sessionF = new Configuration().configure("/com/fhalcom/config/hibernate/hibernate.cfg.xml").addAnnotatedClass(Client.class).buildSessionFactory();
        Session session = sessionF.openSession();

        //Buscando Por un solo ID
        session.beginTransaction();
        List<Client> clients = session.createQuery("from Client c where c.id = 3").getResultList();
        session.getTransaction().commit();
        printClients(clients);


        //Buscando mas de un registro
        session.beginTransaction();
        clients = session.createQuery("from Client c where c.id in(3,4)").getResultList();
        session.getTransaction().commit();
        printClients(clients);



        session.close();
    }

    private static void printClients(List<Client> clients)
    {
        System.out.println("Showing clients...");
        for (Client client : clients) {
            System.out.println(client.toString() + "\n");
        }

    }
}
