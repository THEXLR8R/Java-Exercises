package exercises02;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day : ");
        int weekDay = scanner.nextInt();

        switch (weekDay) {
            case 1 :
                System.out.println("The day of week is Monday !");
                break;
            case 2 :
                System.out.println("The day of week is Tuesday !");
                break;
            case 3 :
                System.out.println("The day of week is Wednesday !");
                break;
            case 4 :
                System.out.println("The day of week is Thursday !");
                break;
            case 5 :
                System.out.println("The day of week is Friday !");
                break;
            case 6 :
                System.out.println("The day of week is Saturday !");
                break;
            case 7 :
                System.out.println("The day of week is Sunday !");
                break;
            default:
                System.out.println("There is no such day!!!!");
                break;
        }
    }
}
