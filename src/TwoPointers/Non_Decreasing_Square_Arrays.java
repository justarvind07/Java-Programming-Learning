package TwoPointers;

import java.util.Scanner;

public class Non_Decreasing_Square_Arrays {
    static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr){
        for (int i =0; i< arr.length; i++){
            for (int j = i+1; j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int[] non_Decreasing_Square_Arrays(int[] arr) {
        int n = arr.length;
        int[] sqr = new int[n];
        int i = 0;
        while (i < n) {
            sqr[i] = arr[i] * arr[i];
            i++;
        }
        return sqr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter " + x + " Element in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Square each numbers: ");
        printArrays(arr);
        int[] sqr = non_Decreasing_Square_Arrays(arr);
        System.out.print("After Square each numbers: ");
        System.out.println();
        printArrays(sqr);

        swapArray(sqr);
        System.out.print("After sort: ");
        printArrays(sqr);
    }
}
