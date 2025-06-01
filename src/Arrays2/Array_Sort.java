package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sort {
    static int [] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
       int[] ans = {arr[0] , arr[arr.length-1]} ;
       return ans;
    }

    // Method which will check the array is sorted or not
//    static boolean isSorted(int[] arr) {
//        boolean sort = true;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[i-1]) {
//                sort = false;
//                break;
//            }
//        }
//        return sort;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // taking input in array
        System.out.println("Enter " + n + " input in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(isSorted(arr));

//        smallestAndLargestElement(arr);
        int [] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest is :"+ ans[0]);
        System.out.println("Largest is : "+ ans[1]);

    }
}
