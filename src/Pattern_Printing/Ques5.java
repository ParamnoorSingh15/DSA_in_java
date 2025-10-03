package Pattern_Printing;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /*


        a a a a
        B B B B
        c c c c
        D D D D


        */

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i%2 != 0){
                    System.out.print((char)((int)'A' + i) + " ");
                }else{
                    System.out.print((char)((int)'a' + i) + " ");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
