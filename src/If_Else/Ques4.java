package If_Else;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

        // Take 3 positive integers input and tell if they can be sides of a triangle or not

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter second side of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter third side of triangle: ");
        int c = sc.nextInt();

        if (a+c>b && b+a>c && c+b>a) {
            System.out.println("These are sides of triangle");
        }
        else {
            System.out.println("These are not sides of triangle");
        }
        sc.close();



    }
}
