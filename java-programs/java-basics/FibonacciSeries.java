import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int size = input.nextInt();

        int first = 0;
        int second = 1;
        int i = 1;

        while (i <= size) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            i++;
        }
    }
}