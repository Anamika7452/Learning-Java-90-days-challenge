import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to which you want the odd number sum: ");
        int num = input.nextInt();

        int sum = 0;
        int i = 0;

        while (i <= num) {
            if ((i & 1) != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of odd numbers till " + num + " is " + sum);
    }
}