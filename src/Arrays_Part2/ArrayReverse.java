package Arrays_Part2;

import java.util.Arrays;

public class ArrayReverse {

    /*This is method one */

    static void arrayReverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.print("this is the Reverse Array " + Arrays.toString(arr));
    }

    /*Method 2*/
    static int[] arrayReverse2(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("This is original array " + Arrays.toString(arr));

        arrayReverse(arr);

        System.out.println("This is method 2 : " + Arrays.toString(arrayReverse2(arr)));
    }
}