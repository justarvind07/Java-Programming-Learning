import java.util.Scanner;

public class SwCase {
    /*Switch case*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("do work");
                break;
            case 2:
                System.out.println(" 2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println(" no error ");
        }
    }
}
