package Strings;

import java.util.Scanner;

public class ReverseUsingBuilder {

    public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);

        String input = "Reverse string by using StringBuilder - first try";

        StringBuilder input1 = new StringBuilder();

        input1.append(input);

        input1 = input1.reverse();

        System.out.println(input1);

    }

}
