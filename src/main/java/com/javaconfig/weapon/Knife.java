package src.main.java.com.javaconfig.weapon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Weapon")
public class Knife extends WeaponA{

    @Value("${knife.damage}")
    int damage;

    @Override
    public void strike() {
        System.out.println("You use a knife");
    }
    
}
