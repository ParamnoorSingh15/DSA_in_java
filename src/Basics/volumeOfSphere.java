package Basics;
import java.util.Scanner;
import java.lang.Math;

public class volumeOfSphere {
    public static void main(String[] args) {
        // Calculate volume of Sphere

        Scanner sc = new Scanner(System.in);


        double rad;
        System.out.print("Enter radius: ");
        rad = sc.nextDouble();

        double volume = 4.0/3.0 * Math.PI * Math.pow(rad, 3);
        System.out.println("Volume of Sphere is: " + volume);

    }
}
