package src.main.java.es.pildoras.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {
        //Antiguo
        // Java Code EE
        EmpleadosI jEmpleado = new JefeEmpleado();
        EmpleadosI sEmpleado = new SecretarioEmpleado();
        System.out.println(jEmpleado.getTareas());
        System.out.println(sEmpleado.getTareas());
        // End Java Code EE
        
        //Spring Code IoC
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/aplicationContext.xml");
        EmpleadosI empleadosI = context.getBean("tEmpleado",EmpleadosI.class);
        System.out.println(empleadosI.getTareas());
        //End Spring Code IoC

    }
}