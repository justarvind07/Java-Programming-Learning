package Arrays2;

import java.util.Scanner;

public class Taking_Input_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter " + n +" Array input");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println("Your Arrays are : "+ arr[i] + " at index position : "+ i);
        }
    }
}
