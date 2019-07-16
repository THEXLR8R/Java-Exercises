package exercises03.lec02;

import java.util.Scanner;

public class task01 {


    public static void main(String[] args) {

        final int THIS_YEAR = 2019;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the data here : ");

        System.out.println("Please enter your first name : ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name : ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your year of birth : ");
        short yearBorn = scanner.nextShort();
        System.out.println("Please enter your weight : ");
        float weight = scanner.nextFloat();
        System.out.println("Please enter your height : ");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your proffession : ");
        String proffession = scanner.nextLine();

        int age = (THIS_YEAR - yearBorn);


        System.out.printf("%s, %s is %d years old. He was born in %d . His weight is %.2f kg and he is %d cm tall. He is a %s .",
                firstName,lastName,age,yearBorn,weight,height,proffession );

    }
}
