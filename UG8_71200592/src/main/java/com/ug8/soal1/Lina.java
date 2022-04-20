package com.ug8.soal1;

public class Lina {
    int damage = 70;
    String name = "Lina";
    int health = 800;
    int mana = 120;
    public Lina() {
        MagicCharacter Lina = new MagicCharacter(name, damage, health, mana);
    }
    private int dragonFormAttack;
    public void skill(Character musuh){
        musuh.attacked(600);
        mana -= 60;
    }
    public void attack(Character musuh){
        musuh.attacked(damage);
        if(musuh.isDie()){
            mana += 45;
        }
    }
}
