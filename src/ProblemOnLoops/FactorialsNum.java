package ProblemOnLoops;

import java.util.Scanner;

public class FactorialsNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " is " + fact);
        }
//        System.out.println("\"\"");
    }
}