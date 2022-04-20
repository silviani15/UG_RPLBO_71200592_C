package com.ug8.soal1;

public class DragonKnight {
    int damage = 95;
    String name = "Dragon Knight";
    int health = 1800;
    int armor = 50;
    public DragonKnight() {
        PhysicalCharacter dk = new PhysicalCharacter(name, damage, health, armor);
    }
    private int dragonFormAttack;
    public void skill(){
        dragonFormAttack = 2;
    }
    public void attack(Character musuh){
        if(dragonFormAttack > 0){
            damage += 90;
            musuh.attacked(damage);
            dragonFormAttack -= 1;
        }
    }
}
