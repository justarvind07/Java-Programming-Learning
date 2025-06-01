package Arrays;

import java.util.Scanner;

public class ArraysSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int length = sc.nextInt();
        int sum = 0;
        int[] arr = new int[length];
        for (int i =0; i< length;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
