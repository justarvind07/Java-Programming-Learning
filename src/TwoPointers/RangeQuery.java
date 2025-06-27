package TwoPointers;

import java.util.Scanner;

public class RangeQuery {
    static int[] prefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int x = sc.nextInt();
        int[] arr = new int[x+1];

        System.out.print("Enter " + x + " Element in array: ");
        for (int i = 1; i <=x; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefSum = prefixSumArray(arr);

        System.out.println("Enter Number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("sum"+ans);
        }
    }
}
