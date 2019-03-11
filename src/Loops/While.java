package Loops;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temperature = scanner.nextInt();

        while (temperature < -50 || 60 < temperature) {
            System.out.println("Humans can't live here!");
            temperature = scanner.nextInt();
        }

        System.out.println("Humans can survive now.");

    }

}
