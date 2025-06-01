package Que;
import java.util.Scanner;
public class Que3 {
   /* checking the given number is 3 digit */
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(" Enter a number");
       int x = sc.nextInt();
       if (x > 99 && x<1000){
           System.out.println("This is 3 digit number");
       }else {
           System.out.println("This is not a 3 digit number");
       }
   }
}
