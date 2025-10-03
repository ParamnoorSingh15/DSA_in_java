package Loops;

public class countingDigits {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        do{
            count++;
            n = n/10;
        }while (n != 0);

        System.out.println(count);
    }
}
