package Arrays2;

import java.util.Scanner;

public class Copying_an_Array {
    // Creating a print Array method
    static void printArray(int []arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter " + n +" Array input");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Calling printArray method
//        printArray(arr);
        // Trying to copy arr in arr2
        int []arr2 = arr;
//        printArray(arr2);

//        now changing the data of arr2
        arr2[0] = 0;
        arr2[1] = 1;

        System.out.print("Before changing arr is :");
        printArray(arr);
        System.out.print("after changing arr2 is : ");
        printArray(arr2);
    }
}
