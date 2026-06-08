package com.codecool.oop.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Attack reduces defender's health by exact attack power amount")
    void testAttackReducesHealthByExactAmount() {
        // Arrange: Set up characters with known stats
        Character strongAttacker = new Character("Knight", 100, 30);  // 30 attack power
        Character testDefender = new Character("Goblin", 50, 15);     // 50 initial health

        // Act: Perform the attack
        strongAttacker.attack(testDefender);

        // Assert: Verify exact health reduction (50 - 30 = 20)
        assertEquals(20, testDefender.getHealth(), "Goblin should have exactly 20 health left (50-30=20)");
    }
}
