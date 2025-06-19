package TwoPointers;

import java.util.Scanner;

public class Arrays_Sort01 {
    static void printArray(int[]arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ "");
        }
        System.out.println();
    }
    static void sortArrays(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            if (arr[left] == 0){
                left++;
            } else if (arr[right]==1) {
                right--;
            }else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int n = arr.length;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter "+a+" Element: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sort: ");
        printArray(arr);
        sortArrays(arr);
        System.out.print("After sort: ");
        printArray(arr);
    }
}
