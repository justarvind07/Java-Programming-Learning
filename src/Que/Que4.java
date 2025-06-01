package Que;
import java.util.Scanner;
public class Que4 {

    /*
     find a number which is divisible by 3 and 5
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st digit");
        int x = sc.nextInt();
        /*System.out.println("Enter 2nd digit");
        int y = sc.nextInt();*/
        int z;
        //if (x%5 == 0 && x % 3==0){
        if (x%5 == 0 && x % 3!=0){
            System.out.println("its divisible");
        } else {
            System.out.println("not divisible");
        }
    }
}
