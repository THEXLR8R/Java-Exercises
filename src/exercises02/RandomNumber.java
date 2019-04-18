package exercises02;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        Random randomNumber = new Random();

        int correctNumber;
        int guessTracker;
        int guessLimit = 3;
        int userInput;
        Scanner in = new Scanner(System.in);
        int game = 1;
        boolean winTracker = false;

        while (1 == game) {
            correctNumber = randomNumber.nextInt(10);
            userInput = 0;
            guessTracker = 0;

            System.out.println("Please guess the number between 1 and 10: ");
            while (correctNumber != userInput && guessTracker < guessLimit) {

                userInput = in.nextInt();
                guessTracker++;

                if (userInput == correctNumber) {
                    System.out.println("You have won the game!");
                    System.out.println("The correct number was " + correctNumber);
                    System.out.println("It took a total of " + guessTracker + " guesses");
                } else if (userInput < correctNumber) {
                    System.out.println("The number is higher than your guess");
                    System.out.println("Please enter your next guess: ");
                } else if (userInput > correctNumber) {
                    System.out.println("The number is lower than your guess");
                    System.out.println("Please enter your next guess: ");
                }
            }

            if (correctNumber != userInput) {
                System.out.println("Sorry you have run out of guesses! The correct number was: " + correctNumber);
            }
        }


    }
}
