package exercises02;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer here :");
        int number = input.nextInt();
        System.out.println("----------------");

        // first part 100% working -> to check if number is odd or even
        // second part WIP -> to check if number is divided by 3 or 5
        if (number % 2 == 0) {
            System.out.println("The number is even : " + number);
        } else if (number % 3 == 0 && number % 5 == 0){
            System.out.println("The number is divided by 3 or 5 : " + " " + number);
        } else {
            System.out.println("The number is odd : " + number);
        }


    }
}
