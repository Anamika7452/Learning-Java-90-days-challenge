import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter your number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter your number 3: ");
        int number3 = input.nextInt();



        if(number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the greatest");
        } else if (number2 > number1 && number2 > number3 ) {
            System.out.println(number2 + " is the greatest");
        }
        else if (number3 > number1 && number3 > number2 ) {
            System.out.println(number3 + " is the greatest");
        }
        else {
             System.out.println("All numbers are same");
        }
    }
}
