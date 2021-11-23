package src.main.java.com.javaconfig.hero;

import src.main.java.com.javaconfig.weapon.WeaponA;


 public abstract class HeroA implements HeroI{
    WeaponA weapon;
    public HeroA(WeaponA weapon){this.weapon = weapon;}
    public void straik(){};
}
