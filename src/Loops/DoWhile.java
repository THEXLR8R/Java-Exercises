package Loops;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double number;
        double sum = 0;

        do {
            System.out.printf("Current sum is: %.2f. Enter another number or 0 to quit: ", sum);

            number = scanner.nextDouble();
            sum += number;
        } while (number != 0);



    }

}
