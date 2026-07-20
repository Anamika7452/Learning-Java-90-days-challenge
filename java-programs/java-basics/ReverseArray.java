import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] myArray = new int[size];
        int i = 0;

        while (i < size) {
            System.out.print("Enter your number: ");
            myArray[i] = input.nextInt();
            i++;
        }

        int j = size - 1;

        System.out.print("Reversed array: ");

        while (j >= 0) {
            System.out.print(myArray[j] + " ");
            j--;
        }
    }
}