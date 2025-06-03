package Arrays_Part2;

public class Swap {
    static void swap(int a, int b) {
        System.out.println("Original values a = " + a + ", b = " + b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap a = " + a + ", b = " + b);


    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int[] arr = {1, 2, 3, 4, 5};
        swap(a, b);
    }
}
