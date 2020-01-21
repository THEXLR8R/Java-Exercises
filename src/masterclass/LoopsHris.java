package masterclass;

import java.util.Scanner;

public class LoopsHris {

    public static void main(String[] args) {

        String str = "Hello my name is ";
        String name = "Hristian";

        for (int i = 0; i <= 5; i++) {
            System.out.println(str + name);
        }

        Scanner temp = new Scanner(System.in);
        System.out.println("Please enter the tempreture ");
        int gradus = temp.nextInt();
        
        if( gradus < 10) {
            System.out.println("Temperature is too low");
        }
        else if (gradus > 10) {
            System.out.println("Tempreture is good for me ");
        } else {
            System.out.println("Too damn hot");
        }
    }
}
