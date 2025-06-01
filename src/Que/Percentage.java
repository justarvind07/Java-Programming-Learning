package Que;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int x = sc.nextInt();

        if (x>=91 && x<=100){
            System.out.println("Excellent");
        } else if (x>=81 && x<= 90) {
            System.out.println("very good");
        } else if (x>= 71 && x<= 80) {
            System.out.println("good");
        } else if (x>= 61 && x<=70) {
            System.out.println("can do better");
        } else if (x>= 51&& x<= 60) {
            System.out.println("average");
        } else if (x>= 41 && x<=50) {
            System.out.println("below average");
        }else {
            System.out.println("fail");
        }

    }
}
