package exercises02;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds : ");

        double weight = input.nextDouble();

        System.out.println("Enter your height in inches : ");

        double height = input.nextDouble();

        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

        System.out.println("Your Body Mass Index is : " + BMI + "!" + "in pounds " + weight + " and in inches " + height);


    }
}
