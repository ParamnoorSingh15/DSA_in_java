package If_Else;
import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.print("The number is even");
        }
        else{
            System.out.print("The number is odd");
        }
        sc.close();

    }
}
