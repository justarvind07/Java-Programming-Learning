package Arrays_Part4;

import java.util.Scanner;

public class RotateArrayInPlaceNTimes {
    static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] nTimeArrayRotation(int[] arr, int n) {
        int m = arr.length;
        n = n % m;
        for (int i = m-n; i<m;i++){
            int [] temp= new int[m];
            temp[i++] = arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter "+n+ " Element in Array: ");
        for (int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Before Rotation : ");
        printArrays(arr);
        int [] ans = nTimeArrayRotation(arr, n);
        printArrays(ans);
    }
}
