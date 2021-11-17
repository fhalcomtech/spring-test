package src.main.java.es.pildoras.IoC;
import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class JefeEmpleado implements EmpleadosI{
    private InformeI informe;

    public String getTareas()
    {
        return "Soy Jefe y Gestiono las tareas del personal";
    }

    public JefeEmpleado(InformeI informeInj) 
    {this.informe = informeInj;}

    @Override
    public String getInforme() {
        // TODO Auto-generated method stub
        return "Creando Informe De Jefe" + informe.getInforme();
    }
}
