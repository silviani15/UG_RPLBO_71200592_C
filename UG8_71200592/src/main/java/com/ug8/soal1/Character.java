package com.ug8.soal1;

public class Character {
    private int damage;
    private String name;
    private int health;

    public Character(int damage, String name, int health) {
        this.damage = damage;
        this.name = name;
        this.health = health;
    }
    public void showCharacterInfo(){
        System.out.println("Hero : " +  this.name);
        System.out.println("Health : " +  this.health);
        System.out.println("Damage : " +  this.damage);
    }
    public boolean isDie(){
        if (health <= 0 ){
            return true;
        }
        else {
            return false;
        }
    }
    public void attacked(int att){
        int atck = this.health - att;
    }
}
