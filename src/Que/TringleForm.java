package Que;

import java.util.Scanner;

public class TringleForm {


    /*Taking input of 3 digits and check it is a triangle or not*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("it can be triangle sides");
        } else {
            System.out.println("This can not be a triangle.");
        }
    }

}
