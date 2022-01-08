package com.fhalcom.test;

import java.util.List;

import com.fhalcom.entity.Client;
import com.fhalcom.entity.ClientDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernateWithRelations {
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = new Configuration()
        .configure("/com/fhalcom/config/hibernate/hibernate.cfg.xml")
        .addAnnotatedClass(Client.class)
        .addAnnotatedClass(ClientDetail.class)
        .buildSessionFactory();
        Session session = sessionFactory.openSession();
        try
        {        
        //Insertar registros en tablas con relacion OneToOne
            ClientDetail cd = new ClientDetail("www.hugo.com", "09999999", "Probrando insercion con indices diferentes");
            Client c = new Client("Huguito", "Lascano", "Cristo del Consuelo", cd);

            session.beginTransaction();
            session.save(c);
            session.getTransaction().commit();

            // Consultando clientes insertados
            session.beginTransaction();
            List<Client> clients = session.createQuery("from Client").getResultList();
            session.getTransaction().commit();
            printClients(clients);

            //Borrar Un registro en cascada
            session.beginTransaction();
            c = session.get(Client.class, 18L);
            if(c!=null)
            {
                session.delete(c);
                session.getTransaction().commit();
                System.out.println("Cliente eliminado con exito");
            }

            // Consultando clientes insertados
            session.beginTransaction();
            clients = session.createQuery("from Client").getResultList();
            session.getTransaction().commit();
            printClients(clients);

        }
        finally{session.close();}
    }
        
        private static void printClients(List<Client> clients)
        {
            System.out.println("Showing clients...");
            for (Client client : clients) {
                System.out.println(client.toString() + "\n");
            }
        }
}
