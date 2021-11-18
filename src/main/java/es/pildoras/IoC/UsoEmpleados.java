package src.main.java.es.pildoras.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import src.main.java.es.pildoras.dependencyInjection.Informe;

public class UsoEmpleados {
    public static void main(String[] args) {
        //Antiguo
        // Java Code EE
        EmpleadosI jEmpleado = new JefeEmpleado(new Informe());
        EmpleadosI sEmpleado = new SecretarioEmpleado();
        ((SecretarioEmpleado) sEmpleado).setInformeI(new Informe());
        System.out.println(jEmpleado.getTareas());
        System.out.println(sEmpleado.getTareas());
        System.out.println(jEmpleado.getInforme());
        System.out.println(sEmpleado.getInforme());
        // End Java Code EE
        
        //Spring Code IoC
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/aplicationContext.xml");
        EmpleadosI empleadosI = context.getBean("JEmpleado",EmpleadosI.class);
        System.out.println(empleadosI.getTareas());
        System.out.println(empleadosI.getInforme());
        //End Spring Code IoC

        //Test Injection With Dependeci Injection by setter
        EmpleadosI sEmpleadosI = context.getBean("SEmpleado",EmpleadosI.class);
        System.out.println(sEmpleadosI.getTareas());
        System.out.println(sEmpleadosI.getInforme());

        context.close();

    }
}