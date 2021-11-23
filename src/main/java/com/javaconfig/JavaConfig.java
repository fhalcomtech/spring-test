package src.main.java.com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import src.main.java.com.javaconfig.hero.HeroA;
import src.main.java.com.javaconfig.hero.Soldier;
import src.main.java.com.javaconfig.weapon.Knife;
import src.main.java.com.javaconfig.weapon.WeaponA;

@Configuration
@ComponentScan("src.main.java.com.javaconfig")
@PropertySource("classpath:/src/main/java/com/javaconfig/properties/javaconfig.properties")
public class JavaConfig
{
/*
    @Bean
    public WeaponA Weapon()
    {
        return new Knife();
    }

    @Bean
    @Autowired
    public HeroA Hero(Knife w){
        return new Soldier(w);
    }
*/
}