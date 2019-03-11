package exercises02;

import java.util.Scanner;

public class DividerBy3Or5 {

    public static void main(String[] args) {

        System.out.println("Please enter the number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("--------------");

        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("Number before divided by 3 is : " + number + "\n" + "Number before divided by 5 is : " + number);
            System.out.println("----------------------------------");
            System.out.println("Number after divided by 3 is : " + number / 3);
            System.out.println("Number after divided by 5 is : " + number / 5);
        } else if (number % 5 == 0) {
            System.out.println("Number before divided by 5 is " + number);
            System.out.println("---------------------------------");
            System.out.println("Number after divided by 5 is : " +  number / 5);
        } else {

            System.out.println("Number can be divided by 3 : " + number / 3);
        }


    }
}
