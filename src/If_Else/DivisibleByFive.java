package If_Else;
import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        /*
        if(num%5==0)
            System.out.print("Number is divisible by 5");
        else
            System.out.print("Number is not divisible by 5"); */


        if(num % 5 == 0 && num % 3 == 0)
            System.out.println("Apoorva");
        else if(num % 3 == 0)
            System.out.println("Bhanu");
        else if(num % 5 == 0)
            System.out.println("Riya");
        else
            System.out.println("Isha");


    }
}
