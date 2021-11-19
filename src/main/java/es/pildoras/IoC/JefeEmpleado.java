package src.main.java.es.pildoras.IoC;
import src.main.java.es.pildoras.dependencyInjection.InformeI;

public class JefeEmpleado implements EmpleadosI{
    private InformeI informe;

    //Injeccion de dependencia por constructor
        public JefeEmpleado(InformeI informeInj) 
        {this.informe = informeInj;}


        
    private String empresa;
    public String getEmpresa() {return empresa;}
    public void setEmpresa(String empresa) {this.empresa = empresa;}
    
    private String email;
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    

    public String getTareas()
    {
        return "Soy Jefe y Gestiono las tareas del personal";
    }

    @Override
    public String getInforme() {
        return "Creando Informe De Jefe: " + informe.getInforme();
    }
}
