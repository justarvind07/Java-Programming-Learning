import java.util.Scanner;

public class AbsoluteVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*Method 1*/

        System.out.println("Enter date for method 1");
        int x = sc.nextInt();
        int abs = Math.abs(x);// this will help to print the absolute value
        System.out.println(abs);

        /*Method 2*/
        System.out.println("data for Method 2");
        int y = sc.nextInt();
        if (y < 0) {
            y *= -1;
            System.out.println(y);
        } else {
            System.out.println(y);
        }
    }
}
