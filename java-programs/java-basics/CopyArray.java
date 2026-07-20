import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] originalArray = new int[size];
        int[] copiedArray = new int[size];

        int i = 0;

        while (i < size) {
            System.out.print("Enter your number: ");
            originalArray[i] = input.nextInt();
            i++;
        }

        int j = 0;

        while (j < size) {
            copiedArray[j] = originalArray[j];
            j++;
        }

        System.out.print("Copied array: ");

        int k = 0;

        while (k < size) {
            System.out.print(copiedArray[k] + " ");
            k++;
        }
    }
}