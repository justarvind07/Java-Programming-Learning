package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{12,56,16},{5,6,8}};
//        [][] arr = sc.next[][];
        String[][] arr2 = {{"Ritik", "Rohan", "Roshan"}, {"Himanshi", "Ronak", "Nitesh"},{"Mikasa", "Rohit", "Priyanshu"}};

        /*System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);

        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[1][2]);

        System.out.println(arr2[2][0]);
        System.out.println(arr2[2][1]);
        System.out.println(arr2[2][2]);*/

        for (int[] arr_1 : arr ) {
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
