package ProblemOnLoops;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int SumOfDigits = 0;
        while (x>0){
            SumOfDigits +=x%10;
            x=x/10;
        }
        System.out.println(SumOfDigits);
    }
}
