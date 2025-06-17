package Arrays_Part4;

import java.util.Scanner;

/*
    Given Q queries, check if the given number is present in the array or not
    NOTE:- Value of all the elements in the arrays is less then 10 to the power of 5
*/
public class FindInArrays {
    static void findInArrays(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println("Found " + arr[i] + " at index position " + i);
            }
            System.out.println("Enter k ");
            int x = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Element in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number that you want to check: ");
        int k = sc.nextInt();
        findInArrays(arr,k);

    }
}
