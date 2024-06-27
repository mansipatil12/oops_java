

import java.util.Random;
import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100 (inclusive)
        int targetNumber = random.nextInt(100) + 1;

        // Initialize guess variable
        int guess;

        // Do-while loop for guessing
        do {
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number!");
            } else if (guess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

        } while (guess != targetNumber); // Continue looping until guess is correct
    }
}

