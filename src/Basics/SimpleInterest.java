package Basics;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double principle = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        System.out.print("Enter years: ");
        double time = sc.nextDouble();

        System.out.printf("Simple interest is : %f", (principle * interestRate * time)/100);


    }
}
