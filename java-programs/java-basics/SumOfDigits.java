import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = input.nextLong();
        long sumOfDigits = 0;

        while(num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        System.out.println("Sum of your digits is: " + sumOfDigits);
    }
}
