package If_Else;
import java.util.Scanner;
import java.lang.Math;

public class Ques3 {
    public static void main(String[] args) {
        // Take integer input and tell if its magnitude is smaller than 69 or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(Math.abs(num) < 69) System.out.println("Its magnitude is less than 69");
        else System.out.println("Its magnitude is not less than 69");




        sc.close();

    }
}
