package src.main.java.es.pildoras.IoC;

import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class SecretarioEmpleado implements EmpleadosI
{
    private InformeI informe;

    public SecretarioEmpleado(InformeI informeInj) 
    {this.informe = informeInj;}
    
    public String getTareas()
    {
        return "Gestionado las tareas de los jefes";
    }

    @Override
    public String getInforme() {
        // TODO Auto-generated method stub
        return "Creando Informe de Impleado" + informe.getInforme();
    }
}