package src.main.java.es.pildoras.IoC;
import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class JefeEmpleado implements EmpleadosI{
    private InformeI informe;

    //Injeccion de dependencia por constructor
        public JefeEmpleado(InformeI informeInj) 
        {this.informe = informeInj;}

    public String getTareas()
    {
        return "Soy Jefe y Gestiono las tareas del personal";
    }

    @Override
    public String getInforme() {
        return "Creando Informe De Jefe: " + informe.getInforme();
    }
}
