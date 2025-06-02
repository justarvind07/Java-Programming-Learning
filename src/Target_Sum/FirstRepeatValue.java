package Target_Sum;

import java.util.Scanner;

public class FirstRepeatValue {
    static int firstRepeatValue(int[]arr){
        int ans = -1;
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    ans = arr[j];
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Taking input in array
        System.out.print("Enter "+ n+ " Element for the array : ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(firstRepeatValue(arr));
    }
}
