package src.main.java.com.lifecycle.console;

public abstract class ConsoleA implements ConsoleI{
    String game;
    public String getGame() {return game;}
    public void setGame(String game) {this.game = game;}

    String type;
    public void setType(String type) {this.type = type;}
    public String getType() {return type;}

    public void init(){System.out.println("Init Console ===> " + this.getClass().getSimpleName());}
    public void destroy(){System.out.println("Turn off Console ===> " + this.getClass().getSimpleName());}
}
