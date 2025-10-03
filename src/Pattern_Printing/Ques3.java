package Pattern_Printing;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        1 1 1
        2 2 2           for n = 3
        3 3 3

        */
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
