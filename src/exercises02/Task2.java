package exercises02;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Double M , O , O2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the Integer for side one : ");
        Double a = input.nextDouble();

        System.out.println("Please enter the Integer for side two : ");
        Double b = input.nextDouble();

        System.out.println("Please enter the Integer for side three : ");
        Double c = input.nextDouble();

        M = (a + b + c)/3;
        System.out.println("Result for M is : " + M);

        O2 = ((a - M)*2 + (b - M)*2 + (c - M)*2) / 3;
        System.out.println("Result for O2 is : " + O2);

        System.out.println("Result for O is : " + Math.sqrt(O2));

    }
}
