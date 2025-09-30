package If_Else;
import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {

        // Take 3 positive integers input and print the greatest of them

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        } else {
            if (b >= c) {
                System.out.println(b + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        }








        sc.close();


    }
}
