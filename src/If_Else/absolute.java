package If_Else;
import java.util.Scanner;
import java.lang.Math;

public class absolute {
    public static void main(String[] args) {

        // Take integer input and print the absolute value of that integer
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

//        System.out.println("Absolute value is: "+ Math.abs(num));

        if(num<0) num = -num;
        System.out.println("Absolute value is: "+ num);



    }
}
