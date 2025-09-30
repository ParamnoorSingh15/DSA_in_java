package Loops;

public class WhileLoop {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.print(i + " ");
//        }

        int i = 1;

        // while loop
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // do-while loop
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= 5);
    }
}
