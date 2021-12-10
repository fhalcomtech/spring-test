
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("Student")
public class Student {
    private String name;
    private Integer edad;
    private String email;

    public Integer getEdad() {return edad;}
    public void setEdad(Integer edad) {this.edad = edad;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
