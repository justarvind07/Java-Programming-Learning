package MultiDiamensionalArrays;

import java.util.Scanner;

public class Print2DArrays {
    static void printArrays(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();


        // Taking input in the 2D array
        int[][] arr = new int[r][c]; // total = r*c
        System.out.println("Enter "+r*c+ " Element in the array: ");
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArrays(arr);
  /*      int[][] arr2 = {{1, 2, 5}, {8, 65, 4}};
        printArrays(arr2);*/


    }
}
