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
        System.out.println(name +  " attacks " + opponent.getName());
        opponent.takeDamage(this.attackPower);
        System.out.println(name + " new health: " + health);
    }

    private void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public void displayStatus() {
        System.out.println(name + " " + health);
        if(isAlive()){
            System.out.println("Still alive:)");
        }else{
            System.out.println(name + " are dead");
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
