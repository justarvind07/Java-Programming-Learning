package Target_Sum;

import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallestElement {
    static int secondSmallestElement(int [] arr){
        if (arr.length<2) return -1;
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] != arr[0]){
                ans = arr[i];
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter : "+n+" Element in the array : ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("second smallest Element in the array : ");
        System.out.println(secondSmallestElement(arr));
    }
}