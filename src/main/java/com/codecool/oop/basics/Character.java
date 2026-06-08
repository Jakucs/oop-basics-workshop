package com.codecool.oop.basics;

public class Character {
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Character opponent) {
        System.out.println(this.name + " attacks " + opponent.name + "!");
        opponent.takeDamage(this.attackPower);
    }

    private void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void displayStatus() {
        if (isAlive()) {
            System.out.println(name + " - Health: " + health);
        } else {
            System.out.println(name + " - DEFEATED");
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
