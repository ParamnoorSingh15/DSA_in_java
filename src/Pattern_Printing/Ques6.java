package Pattern_Printing;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /*


        1
        A B
        1 2 3
        A B C D
        1 2 3 4 5


        */

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i%2 == 0){
                    System.out.print((char)(64 + j) + " ");
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
