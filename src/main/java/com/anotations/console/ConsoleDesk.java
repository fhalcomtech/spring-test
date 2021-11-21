package src.main.java.com.anotations.console;
import org.springframework.stereotype.Component;

//Anotations for declare a Bean in spring
@Component("ConsoleD")
public class ConsoleDesk extends ConsoleA{

    @Override
    public void play() {
        System.out.println("Estas Jugando En un consola de escritorio: " + this.game);
    }
    
}
