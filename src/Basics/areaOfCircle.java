package Basics;
import java.util.Scanner;
import java.lang.Math;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad;
        System.out.print("Enter the radius of the circle: ");
        rad = sc.nextDouble();
        double area = Math.PI * rad * rad;
        System.out.printf("The area of the circle is %.2f", area);
    }
}
