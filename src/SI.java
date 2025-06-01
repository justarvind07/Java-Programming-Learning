import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle");
        float p = sc.nextFloat();
        System.out.println("Rate");
        float r = sc.nextFloat();
        System.out.println("Time");
        float t = sc.nextFloat();

        Float Si = (p * r * t) / 100;
        System.out.println(Si);


    }
}
