package If_Else;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {

        /*
        If cost price and selling price of an item is input through the keyboard,
        write a program to determine whether the seller has made profit or incurred loss or not profit
        no loss. Also determine how much profit he made or loss he incurred
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        int cost = sc.nextInt();

        System.out.print("Enter the selling price: ");
        int sell = sc.nextInt();

        if(sell > cost) System.out.println("You made profit of " + (sell-cost) + " rupees");
        else if(sell == cost) System.out.println("You made neither profit nor loss");
        else System.out.println("You made loss of " + (cost-sell) + " rupees");





        sc.close();


    }
}
