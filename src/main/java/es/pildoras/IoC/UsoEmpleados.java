package main.java.es.pildoras.IoC;

public class UsoEmpleados {
    public static void main(String[] args) {
        EmpleadosI jEmpleado = new JefeEmpleado();
        EmpleadosI sEmpleado = new SecretarioEmpleado();
        System.out.println(jEmpleado.getTareas());
        System.out.println(sEmpleado.getTareas());
    }
}
