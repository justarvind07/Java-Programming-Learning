package Target_Sum;

import java.util.Scanner;

public class Sum_in_Arrays {
    static int sum_In_Arrays(int[] arr, int x){
        int sum = 0;
        for (int i = 0; i<arr.length; i++){ // First Number
            for (int j = i+1; j< arr.length; j++){ // Second Number
                if (arr[i] + arr[j] == x){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+ n+ " Array Input");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target Sum = ");
        int x= sc.nextInt();
        System.out.println(sum_In_Arrays(arr,x));
    }
}
