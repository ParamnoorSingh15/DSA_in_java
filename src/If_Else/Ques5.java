package If_Else;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        // Take Length and Breadth of rectangle as input and write a program to find whether the area of rectangle is greater than its perimeter

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int b = sc.nextInt();

        int perimeter = 2*(l+b);
        int area = l*b;

        if (area > perimeter)
            System.out.println("Yes area of the rectangle is greater than its perimeter");
        else
            System.out.println("No area of the rectangle is not greater than its perimeter");




        sc.close();

    }
}
