package src.main.java.com.anotations.game;

public abstract class gameA implements gameI
{
    protected String tipoJuego;
public String getTipoJuego() {
    return tipoJuego;
}
public void setTipoJuego(String tipoJuego) {
    this.tipoJuego = tipoJuego;
}

    protected String nombreJuego;
    public String getNombreJuego() {
        return nombreJuego;
    }
    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }
}
