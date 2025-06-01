package ProblemOnLoops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans =0;
        while (num>0){
            ans = ans * 10 + num % 10;
            num/=10;
        }
        System.out.println(ans);


        long s = sc.nextLong();
        for (long i =0; i<s; i++){
            System.out.println(i);
        }
    }
}
