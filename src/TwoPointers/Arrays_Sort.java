package TwoPointers;

import java.util.Scanner;

public class Arrays_Sort {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroAndOne(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        // zero to zero-1 : 0 Zeros to n-1 : 1
        for (int i = 0; i < n; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter " + a + " Element in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before sorted: ");
        printArray(arr);
        sortZeroAndOne(arr);
        System.out.print("Array after sorted: ");
        printArray(arr);

    }
}
