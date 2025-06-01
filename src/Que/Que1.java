package Que;

import java.util.Scanner;

public class Que1 {

    /*Profit Loss*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Buy price");
        int buy = sc.nextInt();
        System.out.println("Enter the Selling price");
        int sell = sc.nextInt();

        int pft;
        int loss;

        if (buy>sell){
            loss = buy-sell;
            System.out.println("Rs " +loss +" Loss");
        }if (buy==sell){
            System.out.println(" No Profit and No Loss");
        }if (buy<sell){
            pft = sell-buy;
            System.out.println("Rs " + pft + " Profit");
        }
    }
}
