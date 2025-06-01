package Que;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
//        int y = l;
//        int z = b;
        int area = length*breadth;
        System.out.println("Area is: " + area);
        int perimeter = 2 * (length + breadth);
        System.out.println("Parameter is: " + perimeter);
        if (area<perimeter){
            System.out.println("Perimeter is greater then area");
        } else if (area == perimeter) {
            System.out.println(" Perimeter is equal to area");
        }
        else {
            System.out.println("Area is greater then Perimeter");
        }

        /*checking it is square or not*/

//        int sq;
        if (length == breadth ){
            System.out.println(" it is a square");
        }else {
            System.out.println("it is rectangle");
        }

    }
}
