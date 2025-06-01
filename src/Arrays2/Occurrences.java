package Arrays2;

import java.util.Scanner;

public class Occurrences {
    static int lastOccurrences(int[]arr, int x){
        int count =-1;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == x){
                count = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Taking input in arr
        System.out.println("Enter :" + n +" Elements For Array");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter which number you want to find : ");
        int x = sc.nextInt();
        System.out.print("Last Occurrence of :" + x + " is :" + lastOccurrences(arr, x) );
    }
}
