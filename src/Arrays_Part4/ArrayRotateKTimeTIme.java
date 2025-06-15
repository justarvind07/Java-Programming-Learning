package Arrays_Part4;

import java.util.Scanner;

public class ArrayRotateKTimeTIme {
    // print Array method
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] arrayRotation(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the " + n + " Array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k ");
        int k = sc.nextInt();
//        System.out.println(Arrays.toString(arr));
        System.out.print("Original Array: ");
        printArray(arr);
        /*
            Direct print rotated arrays

        System.out.println("Array After Rotation : ");
        printArray(arrayRotation(arr, k));*/
        int[] ans = arrayRotation(arr, k);
        System.out.print("Array After rotation: ");
        printArray(ans);
    }
}
