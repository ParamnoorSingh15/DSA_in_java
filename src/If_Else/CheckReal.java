package If_Else;
import java.util.Scanner;

public class CheckReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double num = sc.nextDouble();

        if ((int) num == num) System.out.println("The real number is a integer");
        else System.out.println("The real number is not a integer");




        sc.close();
    }
}
