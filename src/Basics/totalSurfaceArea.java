package Basics;
import java.util.Scanner;
import java.lang.Math;

public class totalSurfaceArea {
    public static void main(String[] args) {
        // Calculate total surface area of cuboid
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of cuboid: ");
        double length =  sc.nextDouble();
        System.out.print("Enter the width of cuboid: ");
        double width = sc.nextDouble();
        System.out.println("Enter height of cuboid: ");
        double height = sc.nextDouble();

        double area = 2*((length*width) + (length*height) + (height*width));
        System.out.println("The surface area is "+area);
    }
}
