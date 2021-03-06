package src.main.java.com.lifecycle.console;

import org.springframework.beans.factory.annotation.Autowired;

import src.main.java.com.anotations.game.gameA;

public abstract class ConsoleA implements ConsoleI{

    @Autowired
    gameA gameC;
    public gameA getGameC() {return gameC;}
    public void setGameC(gameA gameC) {this.gameC = gameC;}

    String game;
    public String getGame() {return game;}
    public void setGame(String game) {this.game = game;}

    String type;
    public void setType(String type) {this.type = type;}
    public String getType() {return type;}

    public void init(){System.out.println("Init Console ===> " + this.getClass().getSimpleName());}
    public void destroy(){System.out.println("Turn off Console ===> " + this.getClass().getSimpleName());}


}
