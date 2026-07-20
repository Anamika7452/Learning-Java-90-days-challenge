import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] myArray = new int[size];
        int i = 0;
        int counter = 0;

        while (i < size) {
            System.out.print("Enter your number: ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0) {
                counter++;
            }

            i++;
        }

        System.out.print("Even numbers: " + counter);
    }
}