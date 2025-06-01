package Que;

import java.util.Scanner;

public class GreatestInt {
    /*
        take 3 positive integer and find the greatest number
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number");
        int y = sc.nextInt();
        System.out.println("Enter 3rd number");
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println(x + " is the largest");
        } else if (y > x && y > z) {
            System.out.println(y + " is the largest");
        } else {
            System.out.println(z + " is the largest");
        }

        /*for youngest age*/

        if (x < y && x < z) {
            System.out.println(x + " is the youngest");
        } else if (y < x && y < z) {
            System.out.println(y + " is the youngest");
        } else {
            System.out.println(z + " is the youngest");
        }

    }
}
