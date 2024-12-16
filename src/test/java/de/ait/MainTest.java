package de.ait;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {

    @Test
    void testGetGreetingReturnsCorrectMessage() {
        Main main = new Main();
        String greeting = main.getGreeting("Test");
        assertEquals("Hello, Test!", greeting);
    }

    @Test
    void testGetGreetingReturnsNotCorrectMessage() {
        Main main = new Main();
        String greeting = main.getGreeting("Test2");
        assertNotEquals("Hello, Test2", greeting);
    }

}