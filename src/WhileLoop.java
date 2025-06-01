import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =0;
        while (x < 9){
            x++;
            y += x;
            System.out.println(y);
        }
    }
}
