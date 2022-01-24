package com.fhalcom.dao;

import java.util.List;

import com.fhalcom.entity.Client;

public interface ClientDaoI 
{
    public List<Client> getClients();

    public void save(Client client);

    public Client getById(Long id);

    public void delete(Client client);
}
