package exercises02;

import java.util.Scanner;

public class CalculatorWithIfElse {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number here : ");
        Double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the second number here :");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation do you want to do ?");
        System.out.println("Type Plus to add the numbers with /+/ ");
        System.out.println("Type Minus to subtract the numbers with /-/ ");
        System.out.println("Type Multiplication to multiply the numbers with /*/ ");
        System.out.println("Type Division to divide the numbers with / / / ");
        System.out.println("Type Division to divide the numbers with / % / ");

        String Choise = scanner.nextLine();

        if (Choise.equals("+")) {
            double answer = number1 + number2;
            System.out.println("The answer is :" + answer);
        } else if (Choise.equals("-")) {
            double answer = number1 - number2;
            System.out.println("The answer is " + answer);
        } else if (Choise.equals("*")) {
            double answer = number1 * number2;
            System.out.println("The answer is " + answer);
        } else if (Choise.equals("/")) {
            double answer = number1 / number2;
            System.out.println("The answer is " + answer);
        } else if (Choise.equals("%")) {
            double answer = number1 % number2;
            System.out.println("The answer is " + answer);
        }
    }
}
