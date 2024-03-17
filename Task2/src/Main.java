import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a number:");
        int n = s.nextInt();

        if (n==0){
            System.out.println("The value equals 0");
        }
        if (n>0){
            System.out.println("The number is positive");
        }
        if (n<0){
            System.out.println("The number is negative");
        }

        }
}
