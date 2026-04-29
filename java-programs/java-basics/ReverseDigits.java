import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = input.nextLong();
        long reverseDigits = 0;

        while(num > 0) {
            reverseDigits = reverseDigits * 10 + (num % 10);
            num /= 10;
        }

        System.out.println("Reverse of your digits is: " + reverseDigits);
    }
}
