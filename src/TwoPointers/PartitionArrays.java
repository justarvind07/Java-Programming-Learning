package TwoPointers;

import java.util.Scanner;

public class PartitionArrays {
    static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findSumArrays(int[] arr) {
        int total_Sum = 0;

        for (int i = 0; i < arr.length; i++) {
            total_Sum += arr[i];
        }
        return total_Sum;
    }
    static boolean partitionArrays(int[] arr) {
        int totalSum = findSumArrays(arr);
        int prefSum =0;
        for (int i = 0; i<arr.length; i++){
            prefSum+= arr[i];
            int suffixSum = totalSum-prefSum;
            if (suffixSum==prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];

        System.out.print("Enter " + x + " Element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int[] ans = partitionArrays(arr);
        System.out.println("Equal Partition possible: "+ partitionArrays(arr));

    }
}
