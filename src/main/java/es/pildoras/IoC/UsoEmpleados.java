package es.pildoras.IoC;

public class UsoEmpleados {
    public static void main(String[] args) {
        EmpleadosI jEmpleado = new JefeEmpleado();
        System.out.println(jEmpleado.getTareas());
    }
}
