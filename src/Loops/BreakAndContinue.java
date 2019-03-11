package Loops;

import java.util.Random;
import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {

        int myRandomNumber = 1 + new Random().nextInt(100);
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number: ");
            int input = scanner.nextInt();
            attempts++;

            if (input <= 0) {
                System.out.println("Only positive numbers allowed!");
                continue;
            }

            if (input < myRandomNumber) {
                System.out.println("Try something HIGHER.");
            } else if (input > myRandomNumber) {
                System.out.println("Try something LOWER.");
            } else {
                System.out.println("You got it! It took you " + attempts + " attempts!");
                break;
            }
        }

    }

}
