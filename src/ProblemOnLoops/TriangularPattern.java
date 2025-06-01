package ProblemOnLoops;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        /*type 1
         *
         **
         ***
         */

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*type 2
         ***
         **
         *

         */

        /*for (int i = 1; i <= r; i++) {
            for (int j = i; j <= c; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/


        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
