package com.ug8.soal1;

public class PhysicalCharacter {
    private int damage;
    private String name;
    private int armor;
    private int health;

    public PhysicalCharacter(String name, int damage, int health, int armor) {
        this.armor = armor;
        this.damage = damage;
        this.name = name;
        this.health = health;
    }

    public void showCharacterInfo() {
        System.out.println("Hero : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Damage : " + this.damage);
        System.out.println("Armor : " + this.armor);
    }

    public void attacked(int att){
        int atck = this.health - (att - this.armor);
    }
}
