import java.util.Scanner;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        printDigitsOfNumber(num);
        countDigitsOfNumber(num);
        sumOfDigitsOfNumber(num);
        reverseOfNumber(num);
       if(checkPrime(num)) {
           System.out.println(num + " is prime");
       } else {
           System.out.println(num + " is not prime");
       }
        if(checkPrime2(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }

    public static void printDigitsOfNumber(int num) {
       while (num!=0) {
           int digit = num%10;
           System.out.println(digit);
           num = num/10;
       }
    }

    public static void countDigitsOfNumber(int num) {
        int count= 0;
        while (num!=0) {
            int digit = num%10;
            count++;
            num = num/10;
        }
        System.out.println("Digit count of your number is: " + count);
    }

    public static void sumOfDigitsOfNumber(int num) {
        int sum= 0;
        while (num!=0) {
            int digit = num%10;
            sum +=digit;
            num = num/10;
        }
        System.out.println("Sum of your number is: " + sum);
    }

    public static void reverseOfNumber(int num) {
        int reverseNumber= 0;
        while (num!=0) {
            int digit = num%10;
            reverseNumber =( reverseNumber*10) + digit;
            num = num/10;
        }
        System.out.println("Reverse of your number is: " + reverseNumber);
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        int i = 2;
        while (i <= num - 1) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Optimized approach
    public static boolean checkPrime2(int num) {
        if (num < 2) {
            return false;
        }
        int i = 2;
        while (i*i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
