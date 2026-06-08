package com.codecool.oop.basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Mini RPG Duel Arena ===");
        System.out.println();

        // Create two characters with different stats
        Character hero = new Character("Hero", 100, 25);
        Character goblin = new Character("Goblin", 80, 20);

        // Display initial status
        System.out.println("Initial Status:");
        hero.displayStatus();
        goblin.displayStatus();
        System.out.println();

        // Simulate combat rounds
        System.out.println("=== Combat Begins ===");
        int round = 1;

        while (hero.isAlive() && goblin.isAlive()) {
            System.out.println("Round " + round + ":");

            // Hero attacks first (if alive)
            if (hero.isAlive()) {
                hero.attack(goblin);
            }

            // Goblin counterattacks (if still alive)
            if (goblin.isAlive()) {
                goblin.attack(hero);
            }

            System.out.println();
            round++;
        }

        // Display final status
        System.out.println("=== Final Status ===");
        hero.displayStatus();
        goblin.displayStatus();

        // Announce the winner
        System.out.println();
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " emerges victorious!");
        } else if (goblin.isAlive()) {
            System.out.println(goblin.getName() + " emerges victorious!");
        } else {
            System.out.println("It's a draw! Both fighters are defeated!");
        }
    }
}