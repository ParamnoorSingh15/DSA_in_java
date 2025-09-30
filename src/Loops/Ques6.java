package Loops;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                flag = true;
                break;
            }
        }

        if(n == 1){
            System.out.println("Neither prime nor composite");
        }
        else if(flag){
            System.out.println("Composite number");
        }
        else{
            System.out.println("Prime number");
        }




        sc.close();
    }

}
