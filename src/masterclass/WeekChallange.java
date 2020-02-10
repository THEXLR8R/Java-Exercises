package masterclass;

// write a program . method with name printDayOfTheWeek that has one  parameter of type int and name it day
// method should not return any value -> void
// use a switch statement - sunday -> 0, monday -> 1 ... saturday -> 6, and default -> "invalid day".
// write a second solution using if else statement  ---- > Bonus

public class WeekChallange {

    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday ");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesdays");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Invalid day");
                    break;
        }


    }

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }


}
