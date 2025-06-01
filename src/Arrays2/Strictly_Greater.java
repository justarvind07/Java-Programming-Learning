package Arrays2;

import java.util.Scanner;

public class Strictly_Greater {
    static int strictlyGreater(int[] arr, int x) {
        int greater = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                greater++;
            }
        }
        return greater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // taking input in array
        System.out.println("Enter " + n + " input in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // checking this number
        System.out.println("Enter a number which u want to check");
        int a = sc.nextInt();
        System.out.println("Total greater number is :" + strictlyGreater(arr, a));
    }
}
