package exercises02;

public class Solution {

    public static void main(String[] args)
    {
        int A[][] = {
                { 1, 2, 4, 7 },
                { 3, 5, 8, 10},
                { 6, 9, 11, 12}
        };

        int[] solution = reverseDiagonal(3, 4, A);
        for (int number : solution) {
            System.out.print(number + " ");
        }
    }

    static int[] reverseDiagonal(int N, int M, int[][] A)
    {
        int[] output = new int[M * N];
        int index = -1;
        for (int line = 1; line <= (N + M - 1); line++) {
            int start_col = max(0, line - N);

            int count = min(line, (M - start_col), N);
            int indexCounter = count;
            for (int j = 0; j < count; j++) {
                output[index + indexCounter--] = A[minu(N, line) - j - 1][start_col + j];
            }

            index += count;
        }

        return output;
    }

    static int minu(int a, int b)
    {
        return (a < b) ? a : b;
    }

    static int min(int a, int b, int c)
    {
        return minu(minu(a, b), c);
    }

    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
}
