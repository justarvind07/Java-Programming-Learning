package TwoPointers;

import java.util.Scanner;

public class EvenAndOddSort {
    static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void evenOddSort(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            } else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter " + x + " element in arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Even Odd sort: ");
        printArrays(arr);
        evenOddSort(arr);
        System.out.print("After Even Odd sort: ");
        printArrays(arr);
    }
}
