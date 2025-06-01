package MethodDeclare;

import java.util.Scanner;
/*

class int sum(int a, int b) {
    int sum = a + b;
    return sum;
}
*/

public class SumMethod {
    static int Sum (int a, int b){
        int sum = a +b;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Sum of input is : ");
        int sum = Sum(a,b);
        System.out.println(sum);

    }
}
