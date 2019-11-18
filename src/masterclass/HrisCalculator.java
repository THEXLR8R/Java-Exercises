package masterclass;

public class HrisCalculator {

    public static int Plus (int number1, int number2) {
        return number1 + number2;
    }

    public static int Minus (int number1, int number2) {
        return number1 - number2;
    }

    public static int Multiplication (int number1, int number2) {
        return number1 * number2;
    }

    public static int Devision (int number1, int number2) {
        return number1 / number2;
    }

    public static int Devision2 (int number1, int number2) {
        return number1 % number2;
    }


    public static void main(String[] args) {

        System.out.println(Plus(3,5));
        System.out.println(Minus(5,1));
        System.out.println(Multiplication(4,4));
        System.out.println(Devision(6,2));
        System.out.println(Devision2(7,3));

    }
}
