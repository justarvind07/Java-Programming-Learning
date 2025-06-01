package Arrays2;

import java.util.Scanner;

public class Number_Repeat {
    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Finding Number : ");
        int x = sc.nextInt();

        // Taking input in the array
        System.out.println("Enter : " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("COUNT OF X :" + countOccurrences(arr, x));

    }
}