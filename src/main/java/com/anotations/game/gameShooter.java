package src.main.java.com.anotations.game;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("shoot")
public class gameShooter extends gameA
{
    @Value("Shooter")
    String tipoJuego;

    @Value("Un No Tengo nombre")
    String nombreJuego;

    @Override
    public void presentacion() {
        System.out.println("Estas Jugando un juego de "+ this.tipoJuego +" ==> " + this.nombreJuego);   
    }

}