/*
* Charles Fator and Leonardo Azevedo
* 10/14/24
*/

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        // Array to keep track of the counts for each dice face (1 to 6)
        int[] counts = new int[6];

        // Roll the dice 100 times
        for (int i = 0; i < 100; i++) {
            int result = roll();
            System.out.println("Roll " + result);
            counts[result - 1]++; // Increment the count for the rolled number
        }

        // Print out the counts of each number
        System.out.println("\nNumber of times each number was rolled:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + ": " + counts[i]);
        }
    }

    // Random is a class we can use to generate random numbers
    // You do not need to change anything in the method below
    // Every time you invoke the roll() method, it will generate a random int
    // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
    public static int roll() {
        Random dice = new Random();
        return dice.nextInt(6) + 1;
    }
}