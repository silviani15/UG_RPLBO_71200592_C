package com.ug8.soal1;

public class MagicCharacter {
    private int damage;
    private String name;
    private int mana;
    private int health;

    public MagicCharacter(String name, int damage, int health, int mana) {
        this.mana = mana;
        this.damage = damage;
        this.name = name;
        this.health = health;
    }

    public void showCharacterInfo() {
        System.out.println("Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Damage : " + this.damage);
        System.out.println("Armor : " + this.mana);
    }

    public void attacked(int att){
        int atck = this.health - att;
    }
}
