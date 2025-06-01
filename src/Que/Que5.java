package Que;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = sc.nextInt();
        if (x%5==0 || x%3==0){
            if (x%15!=0){
                System.out.println("This value will be divided by 5 or 3 but not with 15");
            }else {
                System.out.println(" Not matching the required data ");
            }
        }else {
            System.out.println(" Not matching the required data ");
        }

    }
}
