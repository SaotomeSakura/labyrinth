package org.example;

public class Player {

    public String name;
    private int health = 100;
    private int gold = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getGold(){
        return this.gold;
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println("You took " + amount + " damage. Health: " + health);
    }

    public void heal(int amount) {
        health += amount;
        System.out.println("You healed " + amount + " of damage. Health: " + health);
    }

    public void addGold(int amount) {
        gold += amount;
        System.out.println("You gained " + amount + " gold. Total gold: " + gold);
    }

    public boolean isAlive() {
        return health > 0;
    }


}
