package Target_Sum;

import java.util.Scanner;

public class Unique_Element {
    static int uniqueElement(int[] arr){
        int ans = 0;
        for (int i =0; i< arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[i] =-1; // if number is matching then that value will be -1
                    arr[j] =-1;
                }
            }
        }
        for (int i = 0; i< arr.length; i++){
            if (arr[i]> 0){
                ans = arr[i];
            }
        }
        return ans;
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
        System.out.println(uniqueElement(arr));
    }
}
