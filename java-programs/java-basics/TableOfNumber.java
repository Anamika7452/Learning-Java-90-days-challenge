import java.util.Scanner;

public class TableOfNumber {

    static Scanner input = new Scanner(System.in); // single Scanner

    public static void main(String[] args) {
        int num = readInput("Enter The number you want table of: ");
        int tableTo = readInput("Enter till what you want the table: ");

        System.out.println("Below is the table of : " + num);
        int i = 1;
        while (i <= tableTo) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
    public static int readInput(String message) {
        System.out.print(message);
        return input.nextInt();
    }
}