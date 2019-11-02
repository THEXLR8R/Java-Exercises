package masterclass;

import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;

public class Patterns {

    public static void main(String[] args) {

//         5x5
//         *      (0,0) , (1,1) , (2,2)
//         **     (2,1), (3,1) , (3,2)
//         ***
//         ****
//         *****
         for (int i = 0; i <5 ; i++) {
             for (int j = 0; j < 5; j++){
                 if ( i >= j)
                     System.out.print("*" + " ");
                 else
                     System.out.print("  ");
             }
             System.out.println();
         }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j < 5; j++) {
                if (i <= j)
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


    }
}
