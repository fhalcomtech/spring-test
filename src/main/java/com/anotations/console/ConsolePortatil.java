package src.main.java.com.anotations.console;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("ConsoleP")
public class ConsolePortatil extends ConsoleA{
    @Override
    public void play() {
            System.out.println("Estas Jugando En un consola portatil: " + this.game);
    }
    
}
