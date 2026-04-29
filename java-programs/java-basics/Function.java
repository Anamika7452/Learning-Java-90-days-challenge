import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
       int number1 = readInput("Enter First Number: ");
       int number2 = readInput("Enter second number: ");
       int sum = number1 + number2;
       System.out.println("Sum of the numbers are: " + sum);
       patternPrint1();
       patternPrint2();
    }

    public static int readInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    public static void patternPrint1() {
        int rows = readInput("Enter number of rows you want: ");
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void patternPrint2() {
        int rows = readInput("Enter number of rows you want: ");
        int i = rows;
        while (i > 0) {
            int j = 0;

            while (j < i) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
