import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] myArray = new int[size];
        int i = 0;
        int positive = 0;
        int negative = 0;

        while (i < size) {
            System.out.print("Enter your number: ");
            myArray[i] = input.nextInt();

            if (myArray[i] > 0) {
                positive++;
            } else if (myArray[i] < 0) {
                negative++;
            }

            i++;
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}