import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        do {
            int result = x * i;
            System.out.println(result);
            i++;
        } while (i <= 10);
    }
}
