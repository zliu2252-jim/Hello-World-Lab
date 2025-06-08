package org.example;

/**
 * This class is the program that creates an instance of HelloWorld and prints its greeting.
 *
 * @author Zhengjia Liu
 */
public class HelloWorldApp {

    /**
     * Instantiates HelloWorld.
     * Prints its greeting to the console.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getGreeting());
    }
}
