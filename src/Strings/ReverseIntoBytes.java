package Strings;

import java.util.Scanner;

public class ReverseIntoBytes {

    public static void main(String[] args) {

        //	Scanner input = new Scanner(System.in);

        String input = "Reverse string by using bytes!";

        byte [] strAsByteArray = input.getBytes();

        byte [] result = new byte[strAsByteArray.length];

        for (int i = 0; i <strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i -1];
        }
        System.out.println(new String(result));
    }

}
