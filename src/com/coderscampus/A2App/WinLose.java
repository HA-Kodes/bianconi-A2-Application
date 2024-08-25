package com.coderscampus.A2App;

import java.util.Random;
import java.util.Scanner;

public class WinLose {

    public void startGame() {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int numberOfGuesses = 5;
        Scanner scanner = new Scanner(System.in);
        
        while (numberOfGuesses > 0) {

            System.out.println("Pick a number between 1 and 100:");
            int playerGuess = scanner.nextInt();

            if (playerGuess < 1 || playerGuess > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again.");
                continue;
            }

            if (playerGuess == randomNumber) {
                System.out.println("You win!");
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Please pick a higher number.");
            } else {
                System.out.println("Please pick a lower number.");
            }

            numberOfGuesses--;

            if (numberOfGuesses == 0) {
                System.out.println("You lose, the number to guess was " + randomNumber);
            }
        }

        scanner.close();
    }
}

