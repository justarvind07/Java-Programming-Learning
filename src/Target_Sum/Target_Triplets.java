package Target_Sum;

import java.util.Scanner;

public class Target_Triplets {
    static int  triplets_In_Arrays(int[] arr, int target){
        int Triplets = 0;
        for (int i = 0; i< arr.length; i++){ //first number
            for (int j = i+1; j< arr.length; j++){ // second number
                for (int k = j+1; k< arr.length; k++){ // third number
                    if (arr[i] + arr[j]+ arr[k] == target){
                       Triplets++;
                    }
                }
            }
        }
        return Triplets;
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
        System.out.print("Target triplet is = ");
        int target = sc.nextInt();
        System.out.println(triplets_In_Arrays(arr,target));
    }
}
