package Loops;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Geometric Progression

        int n = sc.nextInt();

        int a = 1, r = 2;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a*r;
        }


        sc.close();
    }
}
