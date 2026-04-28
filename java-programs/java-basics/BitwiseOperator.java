import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        int bitwiseAnd = number1 & number2;
        int bitwiseOr = number1 | number2;
        int bitwiseXor = number1 ^ number2;
        int bitwiseNotNumber1 = ~number1;
        int bitwiseNotNumber2 = ~number2;
        int leftShiftNumber1 = number1 << 1;
        int leftShiftNumber2 = number2 << 1;
        int rightShiftNumber1 = number1 >> 1;
        int rightShiftNumber2 = number2 >> 1;

        System.out.println("Result of Bitwise And (&) operator is: " + bitwiseAnd);
        System.out.println("Result of Bitwise Or (|) operator is: " + bitwiseOr);
        System.out.println("Result of Bitwise XOR (^) operator is: " + bitwiseXor);
        System.out.println("Result of Bitwise Not/Compliment (~) operator for number 1 and number 2 are: " + bitwiseNotNumber1 + " , " + bitwiseNotNumber2 + " respectively");
        System.out.println("Result of Bitwise left shift operator (<<) operator for number 1 and number 2 are: " + leftShiftNumber1 + " , " + leftShiftNumber2 + " respectively");
        System.out.println("Result of Bitwise right shift operator (>>) operator for number 1 and number 2 are: " + rightShiftNumber1 + " , " + rightShiftNumber2 + " respectively");


        System.out.println("Checking even and odd using bitwise operator");
        checkOddEven(number1, number2);
    }

    public static void checkOddEven(int number1 , int number2) {
        if((number1 & 1) == 0) {
            System.out.println(number1 + " is even");
        } else {
            System.out.println(number1 + " is odd");
        }
        if((number2 & 1) == 0) {
            System.out.println(number2 + " is even");
        } else {
            System.out.println(number2 + " is odd");
        }
    }
}
