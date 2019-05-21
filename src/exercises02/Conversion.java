package exercises02;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number :" );
        int numnberOne = scanner.nextInt();

        System.out.println("Please enter the second number :");

        int numberTwo = scanner.nextInt();

        System.out.println("Please enter the value of number to convert : ");
        int numberThree = scanner.nextInt();

        int numberTilda = 0b110101;
        int invertedNumber =~numberTilda;

        System.out.println(Integer.toBinaryString(numnberOne));

        System.out.println(Integer.toBinaryString(numberTwo));

        System.out.println(Integer.parseInt(String.valueOf(numberThree),2));

        System.out.println(Integer.toBinaryString(numberTilda));
        System.out.println(Integer.toBinaryString(invertedNumber));

    }
}
