package com.fhalcom.controler.page;

import java.util.List;

import com.fhalcom.dao.ClientDaoI;
import com.fhalcom.entity.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/client")
public class ClientController 
{
    @Autowired
    ClientDaoI cdao;

     @RequestMapping(path = "/list")
     public String clientList(Model model) {
         List<Client> clients = cdao.getClients();
         model.addAttribute("clients", clients);
         return "client-list";
     }

     @RequestMapping(path = "/newclient")
     public String newClient(Model model) 
     {
         Client client = new Client();
         model.addAttribute("client", client);
         return "client-create";
     }

     @RequestMapping(path = "/saveclient")
     public String saveClient(@ModelAttribute("client") Client client)
     {
        cdao.save(client);
        return "redirect:/client/list";
     }

     @RequestMapping(path="/update/{id}")
     public String updateClient(@PathVariable Long id, Model model)
     {
         Client client = cdao.getById(id);
         model.addAttribute("client", client);
         return "client-update";
     }

     @RequestMapping(path="/delete/{id}")
     public String deleteClient(@PathVariable Long id)
     {
         Client client = new Client();
         client.setId(id);
         cdao.delete(client);
         return "redirect:/client/list";
     }
}
