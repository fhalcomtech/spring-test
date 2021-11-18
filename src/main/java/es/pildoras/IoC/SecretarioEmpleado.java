package src.main.java.es.pildoras.IoC;

import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class SecretarioEmpleado implements EmpleadosI
{
    private InformeI informeI;
    
    public InformeI getInformeI(){return this.informeI;}
    public void setInformeI(InformeI informeI){this.informeI = informeI;}
    
    public String getTareas()
    {
        return "Gestionado las tareas de los jefes";
    }

    @Override
    public String getInforme() {
        return "Creando Informe de Secretario: " + informeI.getInforme();
    }
}