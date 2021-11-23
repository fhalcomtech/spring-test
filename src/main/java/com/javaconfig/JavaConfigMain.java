package src.main.java.com.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import src.main.java.com.javaconfig.hero.HeroA;



public class JavaConfigMain {
public static void main(String[] args) 
{
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    HeroA hero1 = context.getBean("Hero", HeroA.class);
    hero1.strike();
    context.close();
}
    
}
