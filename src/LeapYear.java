import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int x = sc.nextInt();
        if (x>=2000){
            if (x%4==0){
                System.out.println("This is leap year");
            }else {
                System.out.println("This is not a leap year");
            }
        }else {
            System.out.println("Enter a valid year");
        }
    }
}
