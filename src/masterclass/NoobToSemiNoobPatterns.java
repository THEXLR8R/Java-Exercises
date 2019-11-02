package masterclass;

public class NoobToSemiNoobPatterns {

    public static void main(String[] args) {

        // cube 5 on 5 with stars ... :D 

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == 0)
                    System.out.print("*" + " ");
                else if (col == 0)
                    System.out.print("*" + " ");
                else if (col == 4)
                    System.out.print("*" + " ");
                else if (row == 4)
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }


    }


}
