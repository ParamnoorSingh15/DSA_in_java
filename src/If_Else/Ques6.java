package If_Else;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        /*
        Given a point (x,y) write a program to find out if it lies in the first quadrant,
        2nd Quadrant, 3rd Quadrant, 4th Quadrant, on the x-axis, y-axis or at the origin.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();



        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Coordinate on y axis");
        } else if (y == 0) {
            System.out.println("Coordinate on x axis");
        } else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("2nd Quadrant");
        }



        sc.close();

    }
}
