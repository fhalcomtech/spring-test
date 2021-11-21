package src.main.java.com.anotations.console;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleMain {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/main/java/com/anotations/contextAnotations.xml");
        // Singleton test
        ConsoleA consoleDesk = context.getBean("ConsoleD",ConsoleA.class);
        consoleDesk.setGame("Mario");
        consoleDesk.play();

        ConsoleA consoleDesk2 = context.getBean("ConsoleD",ConsoleA.class);
        consoleDesk2.setGame("Zelda");
        consoleDesk2.play();


        // Comprare Singleton Beans Same memory address
        System.out.println(consoleDesk + " == " + consoleDesk2 + " ===> " + (consoleDesk == consoleDesk2) );
        // Value to change to Zelda
        consoleDesk.play();
        //End Singleton Test


        // Prototype test
        ConsoleA consolePortable = context.getBean("ConsoleP",ConsoleA.class);
        consolePortable.setGame("Sonic");
        consolePortable.play();

        ConsoleA consolePortable2 = context.getBean("ConsoleP",ConsoleA.class);
        consolePortable2.setGame("Crash");
        consolePortable2.play();
        consolePortable2.getRealGame().presentacion();

        // Comprare Prototype Beans have diferent memory address
        System.out.println(consolePortable + " == " + consolePortable2 + " ===> " + (consolePortable == consolePortable2) );
        // Value to change to Zelda
        consolePortable.play();
        //End Prototype Test


        context.close();

    }
}
