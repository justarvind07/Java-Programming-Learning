package Arrays_Part2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayInPlace {
    static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrayInPlace(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter " + n + " Element in array : ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverseArrayInPlace(arr);
        printArray(arr);
    }
}
