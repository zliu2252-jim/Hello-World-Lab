package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test method for the HelloWorld class.
 * Ensures that HelloWorld returns a valid greeting string.
 */
class HelloWorldTest {

    /**
     * Use the test to verify that getGreeting() returns a non-null String.
     */
    @Test
    void itHasAGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertNotNull(helloWorld.getGreeting());

    }
}