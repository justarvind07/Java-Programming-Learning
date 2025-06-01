package Que;

import java.util.Scanner;

public class Que6 {
    /*Checking Straight Line axis check*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("X axis :");
        int x = sc.nextInt();
        System.out.println("Y axis :");
        int y = sc.nextInt();
        if (x==0 && y==0){
            System.out.println("The point is at the origin");
        } else if (y==0) {
            System.out.println("the point is at the x axis");
        }else if (x == 0){
            System.out.println("The point is at the y axis");
        }else {
            System.out.println("the point is neither lie x axis and nor y axis");
        }
    }
}
