package Loops;

public class SquareCube {

    public static void main(String[] args) {

        int number;
        int square;
        int cube;

        System.out.println("Number\tSquare\tCube");

        for (number = 0; number<= 10; number++) {

            square = number * number;
            cube = square * number;

            System.out.println(number + "\t" + square + "\t" + cube);
        }
    }
}
