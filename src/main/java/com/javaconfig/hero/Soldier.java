package src.main.java.com.javaconfig.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.com.javaconfig.weapon.WeaponA;

@Component("Hero")
public class Soldier extends HeroA
{
    @Autowired
    public Soldier(WeaponA weapon) 
    {super(weapon); }

    @Override
    public void strike() {
        System.out.println("Eres Un soldado...");
        this.weapon.strike();
    }

}