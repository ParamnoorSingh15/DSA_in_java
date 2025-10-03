package Pattern_Printing;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        1 2 3
        1 2 3           for n = 3
        1 2 3

        */
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
