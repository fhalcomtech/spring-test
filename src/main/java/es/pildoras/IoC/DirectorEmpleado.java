package src.main.java.es.pildoras.IoC;

import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class DirectorEmpleado implements EmpleadosI{
    private InformeI informe;
    @Override
    public String getTareas() {
        // TODO Auto-generated method stub
        return "Director: Gestionando tareas de los Jefes";
    }


    public DirectorEmpleado(InformeI informeInj) 
    {this.informe = informeInj;}

    @Override
    public String getInforme() {
        // TODO Auto-generated method stub
        return "Reporte Director" + informe.getInforme();
    }
    
}
