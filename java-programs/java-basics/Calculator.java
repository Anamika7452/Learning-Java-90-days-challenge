import  java.lang.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        int sum  = number1 + number2;
        System.out.println("Sum of : " + number1 + " and " +  number2 + " is: " +  sum);
        int difference  = number1 - number2;
        System.out.println("Difference of : " + number1 + " and " +  number2 + " is: " +  difference);
        int multiply  = number1 * number2;
        System.out.println("Multiply of : " + number1 + " and " +  number2 + " is: " +  multiply);
        int division  = number1 / number2;
        System.out.println("Division of : " + number1 + " and " +  number2 + " is: " +  division);
        int modulus  = number1 % number2;
        System.out.println("Modulus of : " + number1 + " and " +  number2 + " is: " +  modulus);
    }
}
