import  java.lang.*;
import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
       int number1 = 10;
       int number2 = 5;
        System.out.println("Number 1 is: " + number1 + " and Number 2 is: " + number2 );
       int number3 = number2;
       number2 = number1;
       number1 = number3;
       System.out.println("After swapping your Number 1 becomes: " + number1 + " and Number 2 becomes: " + number2);
       // Swap number by tasking user input
       swapUserNumber();
    }

    public static void swapUserNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        System.out.println("Number 1 is: " + number1 + " and Number 2 is: " + number2 );
        int number3 = number1;
        number1 = number2;
        number2 = number3;
        System.out.println("After swapping your Number 1 becomes: " + number1 + " and Number 2 becomes: " + number2);
    }
}
