package Arrays;

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] age = new int[5];

        for (int i=0; i<age.length;i++){
            int ml = i*age[0];
            age[0]++;

            System.out.println("this is ml " +ml);
            System.out.println("this is ml " +age);

        }
    }
}
