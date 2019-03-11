package Loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N and I will give you the sum 1 to N: ");
        int input = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        System.out.printf("The sum of 1 to %d is: %d%n", input, sum);


    }

}
