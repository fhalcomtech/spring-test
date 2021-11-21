package src.main.java.com.anotations.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import src.main.java.com.anotations.game.gameA;

public abstract class ConsoleA implements ConsoleI{
    String game;
    public String getGame() {return game;}
    public void setGame(String game) {this.game = game;}

    String type;
    public void setType(String type) {this.type = type;}
    public String getType() {return type;}

    @Autowired
    @Qualifier("rol")
    gameA realGame;
    public gameA getRealGame() {return realGame;}
    public void setRealGame(gameA realGame) {this.realGame = realGame;}

    public void init(){System.out.println("Init Console ===> " + this.getClass().getSimpleName());}
    public void destroy(){System.out.println("Turn off Console ===> " + this.getClass().getSimpleName());}
}
