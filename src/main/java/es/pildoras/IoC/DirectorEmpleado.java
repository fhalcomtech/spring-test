package src.main.java.es.pildoras.IoC;

import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class DirectorEmpleado implements EmpleadosI{
    private InformeI informe;
    
        //Injeccion de dependencia por constructor
        public DirectorEmpleado(InformeI informeInj) 
        {this.informe = informeInj;}

    @Override
    public String getTareas() {
        return "Director: Gestionando tareas de los Jefes";
    }

    @Override
    public String getInforme() {
        return "Reporte Director" + informe.getInforme();
    }
    
}
