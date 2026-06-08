package com.codecool.oop.basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Mini RPG Duel Arena ===");


        // Create two characters with different stats
        Character hero = new Character("Hero", 100, 25);
        Character goblin = new Character("Goblin", 80, 20);

        // Display initial status
        System.out.println(hero.getName() + "'s health: " + hero.getHealth());
        System.out.println(goblin.getName() + "'s health: " + goblin.getHealth());


        // Simulate combat rounds
        System.out.println("=== Combat Begins ===");
        int i = 0;
        while (hero.isAlive() && goblin.isAlive()){
            i++;
            if(i%2==0 && hero.isAlive()){
                hero.attack(goblin);
            }else{
                goblin.attack(hero);
            }
        }



        // Display final status
        System.out.println("=== Final Status ===");
        hero.displayStatus();
        goblin.displayStatus();

        // Announce the winner
        System.out.println();

    }
}