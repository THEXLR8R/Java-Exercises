package masterclass;

public class NoobToSeminoob2 {

    public static void main(String[] args) {

        int[] x = {1, 13, 2, 1, 8, 10, 9, 4, 3};
        //   printArray(x);
        //   printEvenArray(x);
        //   printOddArray(x);
        //   System.out.println(sumOfEvens(x));
//        System.out.println(sumOfOdds(x));
//        System.out.println(sumOfEvenIndices(x));
        System.out.println(sumOfOddsIndices(x));
    }

    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static void printEvenArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0)
                System.out.println(x[i] + " ");
        }
    }

    public static void printOddArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 1)
                System.out.println(x[i] + " ");
        }
    }

    public static int sumOfEvens(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0)
                sum = sum + x[i];
        }
        return sum;
    }

    public static int sumOfOdds(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 1)
                sum = sum + x[i];
        }
        return sum;
    }

    public static int sumOfEvenIndices(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0)
                sum = sum + x[i];
        }
        return sum;
    }

    public static int sumOfOddsIndices(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 1)
                sum = sum + x[i];
        }
        return sum;
    }
}
