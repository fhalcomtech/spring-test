package com.fhalcom.dao;

import java.util.List;

import com.fhalcom.entity.Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ClientDao implements ClientDaoI {

    @Autowired
    private SessionFactory sf;
    
    @Override
    @Transactional
    public List<Client> getClients() {
        
        Session s = this.sf.getCurrentSession();
        List<Client> clients = s.createQuery("From Client",Client.class).getResultList();
        return clients;
    }

    @Override
    @Transactional
    public void save(Client client) {
        
        Session s = this.sf.getCurrentSession();
        s.saveOrUpdate("Client", client);
    }

    @Override
    @Transactional
    public Client getById(Long id) {
        
        Session s = this.sf.getCurrentSession();
        Client c = s.get(Client.class, id);
        return c;
    }

    @Override
    @Transactional
    public void delete(Client client) 
    {
        Session s = this.sf.getCurrentSession();
        s.delete(client);   
    }
    
}
