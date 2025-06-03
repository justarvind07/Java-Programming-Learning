package Arrays_Part2;

public class Swap2 {
    static void swap2(int a, int b) {
        System.out.println("Before swap a : " + a + " b : " + b);
        a = a + b;  // a = 4 + 6; so a = 10;
        b = a - b;  // b = 10 - 6; so b = 4;
        a = a - b;  // a = 10 - 4; so a = 6;

        System.out.println("After swap a : " + a + " b : " + b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        swap2(a,b);
    }

}
