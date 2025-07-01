package org.example;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1 + (int)(5 * Math.random());
        int attempts = 3;

        System.out.println("I'm thinking of a number between 1 and 5.");

        for (int i = 1; i < attempts + 1; i++) {
            System.out.print("Guess " + i + ": ");
            int guess = input.nextInt();

            if (guess == number) {
                System.out.println("You guessed it! You win!");
                input.close();

                return;
            }
            else if (guess != number) {
                System.out.println("Wrong guess.");
            }
        }

        System.out.println("You lose. The correct number was: " + number);
        input.close();
    }
}