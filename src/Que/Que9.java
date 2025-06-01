package Que;

import java.util.Scanner;



/*              Using break keyword in loop*/

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Found Ans " + num);
                break;
            }
            num++;
        }
    }
}
