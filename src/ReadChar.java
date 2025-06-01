import java.util.Scanner;

public class ReadChar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name");
        char Name = sc.next().charAt(3);

        System.out.println(Name);
        int p = 5;
        int q = 6;
//        boolean x = 0;
        System.out.println(p==q);
    }
}
