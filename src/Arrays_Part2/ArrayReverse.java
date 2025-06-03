package Arrays_Part2;

import java.util.Arrays;

public class ArrayReverse {
    static void arrayReverse(int [] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j< arr.length; j++){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
        System.out.print("this is the Reverse Array "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println("This is original array "+ Arrays.toString(arr));

        arrayReverse(arr);
    }
}
