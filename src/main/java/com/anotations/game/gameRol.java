package src.main.java.com.anotations.game;

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
}
