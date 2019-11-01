package masterclass;

import java.util.Scanner;

public class Hris {


    static void SayHi(String name, int age, String gender) {

        System.out.println("Hello " + name + " what is your age? " + age + " " + gender);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String address;
        int phoneNumber;
        int sign;

        SayHi("Jane", 35,"Female");
        SayHi("Monika", 29,"female");

        System.out.println("Tell me your address.");
        address = sc.nextLine();
        System.out.println("Please tell us your number");
        phoneNumber = sc.nextInt();
        System.out.println("Please tell us your sign");
        sign = sc.nextInt();
        System.out.println("Thank you !");

    }




}

