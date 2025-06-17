package Arrays_Part4;

import java.util.Scanner;

/*
    Given Q queries, check if the given number is present in the array or not
    NOTE:- Value of all the elements in the arrays is less then 10 to the power of 5
*/
public class Practice {
    static int[] newFrequency(int[] arr){
        int[] freq = new int[1000005];
        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter "+n+" Element in array: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = newFrequency(arr);
        System.out.print("Enter Number of queries: ");
        int q = sc.nextInt();
        while (q>0){
            System.out.print("Enter Number to be searched: ");
            int x = sc.nextInt();
            if (freq[x] >0){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
            q--;
        }
    }
}
