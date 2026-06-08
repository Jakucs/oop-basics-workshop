# Workshop Project: Mini RPG Duel
## Goal
Your task is to create a simple, command-line-based RPG duel simulation. You will model a Character from scratch and simulate a fight between two instances of it. The goal is to apply the fundamental principles of Object-Oriented Programming to solve a practical problem.
## Background
In this project, you will model a simple entity from a game. Think about what a character is (its attributes) and what it can do (its actions). Your challenge is to translate these concepts into a well-structured Java class that is robust and logical.

## Project Requirements
Your application must simulate a duel between two characters. To do this, you need to build the core component: a model for a character.
### The Character Model
* Core Attributes: Every character in the game has a name, health points (HP), and attack power (AP). These are the essential properties that define a character's state.
* State Protection (Encapsulation): A character’s internal state (like its health) must be protected. Other parts of the program should not be able to directly modify these attributes arbitrarily (e.g., you cannot allow hero.health = 9999; from your main method). The character must be in control of its own data.
* Creation: It must be possible to create a new character by providing its name, initial health, and attack power all at once. A character should not be allowed to exist in an incomplete state (e.g., without a name or health).
### Character Actions & Behaviors
* Attacking: A character must be able to attack another character. When an attack occurs, the opponent's health should be reduced by the attacker's attack power. The simulation should print a descriptive message to the console about the attack (e.g., "Hero attacks Goblin!").
* Status Reporting: There must be a way to get a character's current status. When requested, it should print its name and current health to the console.
* Checking Vitality: We need a way to determine if a character is still alive (i.e., its health is above 0). If a character's health drops to 0 or below, its status report should indicate that it has been defeated.

### The Duel Simulation
Your main method should serve as the arena. It must demonstrate your Character model by:
* Creating two different characters (e.g., a hero and a monster) with distinct stats.
* Displaying their initial status.
* Simulating at least one full round of combat, where each character attacks the other once (if they are still alive).
* Displaying the final status of both characters after the combat round.

### Acceptance Criteria
Your project is complete when:
* The program runs without errors.
* The console output clearly shows the initial state of two different characters.
* The output shows descriptive messages for each attack that occurs.
* When one character attacks another, the opponent's health decreases by the correct amount, and this is reflected in their next status report.
* A character with 0 or less health is correctly identified as "defeated".
* The code is well-structured in a Character class, and its attributes cannot be directly modified from the main method.
### Bonus Challenge
* Write a unit test to verify that the attack logic works correctly.
* Expand the combat simulation in main into a while loop that continues until one of the characters is no longer alive.