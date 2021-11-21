package src.main.java.com.anotations.game;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rol")
public class gameRol extends gameA{

    @Value("Rol")
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
            case 1: {this.nombreJuego = "Far cry"; break;}
            case 2: {this.nombreJuego = "God of war"; break;}
            case 3: {this.nombreJuego = "Mario Bros"; break;}
        }
    }

}
