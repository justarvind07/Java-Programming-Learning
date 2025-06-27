package TwoPointers;

import java.util.Scanner;

public class PrefixSum {
    static void printArrays(int[]arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefixSum(int[] arr){
        int left = 0;
        int right = 1;
        int n = arr.length;
        while (right< n){
            if (left<right){
                arr[right] = arr[left]+arr[right];
                left++;
                right++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter "+x+" Element in the array: ");
        for (int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before prefix: ");
        printArrays(arr);
        int[] pref = prefixSum(arr);
        printArrays(pref);
    }
}
