package src.main.java.es.pildoras.IoC;

import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class SecretarioEmpleado implements EmpleadosI
{
    private InformeI informeI;
    public InformeI getInformeI(){return this.informeI;}
    public void setInformeI(InformeI informeI){this.informeI = informeI;}
    
    private String empresa;
public String getEmpresa() {return empresa;}
public void setEmpresa(String empresa) {this.empresa = empresa;}

private String email;
public String getEmail() {
    return email;}
public void setEmail(String email) {
    this.email = email;
}


    public String getTareas()
    {
        return "Gestionado las tareas de los jefes";
    }

    @Override
    public String getInforme() {
        return "Creando Informe de Secretario: " + informeI.getInforme();
    }
}