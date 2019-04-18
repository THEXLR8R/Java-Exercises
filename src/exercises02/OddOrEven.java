package exercises02;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println("Enter your number :");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String result = number % 2 == 0 ? "Tbe number is EVEN." : "The number is Odd.";
        System.out.println(result);
    }
}
