package Arrays_Part4;

import java.util.Scanner;

/*
    Given Q queries, check if the given number is present in the array or not
    NOTE:- Value of all the elements in the arrays is less then 10 to the power of 5
*/
public class FindInArrays {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for (int i =0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
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

        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        while (q>0){
            System.out.print("Enter number to be searched in arrays: ");
            int x= sc.nextInt();
            if (freq[x]>0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            q--;
        }

    }
}
