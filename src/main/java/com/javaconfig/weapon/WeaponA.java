package src.main.java.com.javaconfig.weapon;

import org.springframework.beans.factory.annotation.Value;

public abstract class WeaponA implements WeaponI{
    @Value("${default.damage}")
    int damage;
}
