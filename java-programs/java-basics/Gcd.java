import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        long num1 = input.nextLong();
        System.out.print("Enter the number2: ");
        long num2 = input.nextLong();
        System.out.println("GCD of your number is: " + gcd(num1, num2));
    }

    public static long gcd(long num1, long num2) {
        long gcd = 1;
        for (long i = 2; i <= min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    public static long min(long num1, long num2) {
        if(num1>=num2) {
           return num1;
       } else {
            return   num2;
        }
    }
}
