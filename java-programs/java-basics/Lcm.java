import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        long num1 = input.nextLong();
        System.out.print("Enter the number2: ");
        long num2 = input.nextLong();
        System.out.println("LCM of your number is: " + lcm(num1, num2));
    }

    public static long lcm(long num1, long num2) {
        long i = 1;
        while (i <= num2) {
            long factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }
}
