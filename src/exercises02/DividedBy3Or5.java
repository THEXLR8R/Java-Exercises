package exercises02;

import java.util.Scanner;

public class DividedBy3Or5 {

    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String result = number % 3 == 0 && number % 5 == 0 ?
                "The number could be divided by 3 and 5" :
                "The number could not be divided by 3 and 5";

        System.out.println(result);
    }
}
