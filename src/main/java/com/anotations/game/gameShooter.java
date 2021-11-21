package src.main.java.com.anotations.game;
import java.util.Random;

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

    
    @Override
    protected void getRandomGame() {
        Random r = new Random();
        int rgame = 1 + r.nextInt(3);
        switch(rgame)
        {
            case 1: {this.nombreJuego = "Overwatch"; break;}
            case 2: {this.nombreJuego = "Call of Duty"; break;}
            case 3: {this.nombreJuego = "Hitman"; break;}
        }
    }

}