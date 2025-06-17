package Arrays_Part4;

import java.util.Scanner;

public class RotateArrayInPlaceNTimes {
    static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void kTimeArrayRotation(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) return; // no rotation is needed
        reverseArray(arr, 0, n - 1); // Reverse complete arrays
        reverseArray(arr, 0, k - 1); // reverse array first k element
        reverseArray(arr, k, n - 1); // reverse the remaining element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Element in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Before Rotation : ");
        printArrays(arr);
        //int[] ans = kTimeArrayRotation(arr, n);
        kTimeArrayRotation(arr, k);
        System.out.print("After rotation: ");
        printArrays(arr);
        sc.close();
    }
}
