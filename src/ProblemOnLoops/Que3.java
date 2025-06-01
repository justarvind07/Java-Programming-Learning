package ProblemOnLoops;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                ans -= i;
            }
            else {
                ans += i;
            }
        }
            System.out.println(ans);
    }
}
