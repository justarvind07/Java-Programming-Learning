package Arrays2;

import java.util.Scanner;

public class CloneOfArrays {
    // print array method
    static void printArray(int []arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int []arr = new int[n];

        // Taking input in array
        System.out.println("Enter " + n +" Array input");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        /*This clone will help to assign arr2 different address not same address with arr
        so that the arr2 changes not reflect in the arr*/

        int []arr2 = arr.clone();
        // changing the values in arr2
        arr2[0] = 0;
        arr2[1] = 1;

        System.out.print("Before changing arr is :");
        printArray(arr);
        System.out.println();
        System.out.print("after changing arr2 is : ");
        printArray(arr2);
    }
}
