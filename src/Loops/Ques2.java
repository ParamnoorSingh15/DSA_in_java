package Loops;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();


//        int a = 99;
//        int d = -4;
//        for(int i = n; i>=1; i--){
//            System.out.print(a + " ");
//            a = a+d;
//        }

        for (int i = 99; i >= 103-4*n; i-=4) {
            System.out.print(i + " ");
        }




        sc.close();
    }
}
