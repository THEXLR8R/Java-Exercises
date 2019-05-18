package exercises02;

import java.util.Scanner;

public class CalculatorWithSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter operator (+ , - , * , / %) : ");
        String operator = scanner.next();

        String result = "";

        switch (operator) {
            case "+" :
                System.out.println(number1 + operator + number2 + " = " + ( number1 + number2));
                break;
            case "-" :
                System.out.println(number1 + operator + number2 + " = " + (number1 - number2));
                break;
            case "*" :
                System.out.println(number1 + operator + number2 + " = " + (number1 * number2));
                break;
            case "/" :
                System.out.println(number1 + operator + number2 + " = " + (number1 / number2));
                break;
            case "%" :
                System.out.println(number1 + operator + number2 + " = " + (number1 % number2));
                break;
            default:
                System.out.println("Unknown operator !!! ");
                break;

        }


    }
}
