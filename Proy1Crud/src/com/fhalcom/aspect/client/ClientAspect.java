package com.fhalcom.aspect.client;

import java.util.List;

import com.fhalcom.entity.Client;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ClientAspect {

    @Pointcut("execution(public * saveC*(..))")
    private void aspectClientSave()
    {System.err.println("Savin...");}

    @Pointcut("execution(public void save(..))")
    private void aspectClientUpdate()
    {System.err.println("Updating...");}


    @Before("aspectClientSave()")
    private void aspectPreClientSave(JoinPoint jpoint)
    {
        Object[] arg = jpoint.getArgs();
        Client client = (Client) arg[0];
        if(client.getId()!=null) System.err.println("Updating Client..." + client.getId().toString());
        else System.err.println("Saving Client... ");
    }

    @AfterReturning(pointcut="execution(public * getClients(..))", returning = "clients")
    public void aspectClients(List<Client> clients){
        int fl = 0;
        if(clients!=null){
            for (Client c : clients) {fl+=c.getLastname().compareToIgnoreCase("Lascano")==0?1:0;}
        }
        System.err.println("Existe " + fl + " Lascano");
    }
}
