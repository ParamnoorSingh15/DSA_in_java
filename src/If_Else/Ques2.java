package If_Else;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        // Take positive integer input and tell if it is a four digit number or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 999 && num < 10000) System.out.println("It is 4 digit number");
        else System.out.println("It is not 4 digit number");



        sc.close();
    }
}
