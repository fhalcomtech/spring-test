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
        JefeEmpleado empleadosI = context.getBean("JEmpleado",JefeEmpleado.class);
        System.out.println(empleadosI.getTareas());
        System.out.println(empleadosI.getInforme());
        //End Spring Code IoC
        
        //Start dependency injection test to field with default value from config file
        System.out.println(empleadosI.getEmail());
        System.out.println(empleadosI.getEmpresa());
        //Start dependency injection test to field with default value from config file
        
        //Start Test Injection With Dependeci Injection by setter
        SecretarioEmpleado sEmpleadosI = context.getBean("SEmpleado", SecretarioEmpleado.class);
        System.out.println(sEmpleadosI.getTareas());
        System.out.println(sEmpleadosI.getInforme());
        //End Test Injection With Dependeci Injection by setter
        
        //Start dependency injection test to field with default value
        System.out.println(sEmpleadosI.getEmail());
        System.out.println(sEmpleadosI.getEmpresa());
        //End dependency injection test to field with default value

        context.close();

    }
}