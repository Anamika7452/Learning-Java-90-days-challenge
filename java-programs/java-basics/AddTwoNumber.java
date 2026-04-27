import  java.lang.*;
import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum of your number is: " + sum);
    }
}
