package com.fhalcom.aspect.client;

import java.util.GregorianCalendar;
import java.util.List;

import com.fhalcom.entity.Client;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.joda.time.Minutes;
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
        //ejecuta Justo antes de retornar los datos donde returning son los datos que devuelve la funcion
        int fl = 0;
        if(clients!=null){
            for (Client c : clients) {fl+=c.getLastname().compareToIgnoreCase("Lascano")==0?1:0;}
        }
        System.err.println("Existe " + fl + " Lascano");
    }

    @AfterThrowing(pointcut="execution(public void save(..))", throwing = "udpateException")
    public void aspectClientUpdateTrows(Throwable udpateException)
    {
        System.err.println(" ============> Hubo un error al leer los datos <============ ");
    }

    @After("execution(public void save(..))")
    public void aspectClientUpdateAfter(JoinPoint jpoint)
    {
        //Funciona despues de ejecutar la funcion donde JoinPoint son los datos que recibe la funcion
        System.err.println(" ============> Validando con after <============ ");
        Object[] arg = jpoint.getArgs();
        Client client = (Client) arg[0];
        System.out.println(" ============> Cliente: " + client.getName() +" - "+ client.getLastname());
    }
/*
    @Around("aspectClientUpdate()")
    public void aspectClientUpdateArround(JoinPoint jpoint)
    {
        //Funciona despues de ejecutar la funcion donde JoinPoint son los datos que recibe la funcion
        GregorianCalendar date = new GregorianCalendar();
        System.err.println(" ============> Ejecutando around <============ " + date.getTimeInMillis());
        Object[] arg = jpoint.getArgs();
        Client client = (Client) arg[0];
        System.out.println(" ============> Cliente: " + client.getName() +" - "+ client.getLastname());
    }
*/

}
