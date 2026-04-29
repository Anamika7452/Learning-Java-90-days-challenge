import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = input.nextLong();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        
        long factorial = 1;
        int i = 0;
        while (i < num) {
            factorial *= num-i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
