package Loops;

public class basicLoop {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.print(i+ " ");
        }
        // System.out.println(i); // Scope issue
        System.out.println("\nEven numbers from 1 to 100");
        for(int i = 2; i<=100; i+=2){
            System.out.print(i+ " ");
        }

        System.out.println("\nDecreasing Loop");

        for(int i = 6; i>=1; i--){
            System.out.print(i + " ");
        }
    }
}
