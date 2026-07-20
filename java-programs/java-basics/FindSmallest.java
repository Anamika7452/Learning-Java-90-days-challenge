import java.util.Scanner;

public class FindSmallest {
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

        int smallest = myArray[0];
        int j = 1;

        while (j < size) {
            if (myArray[j] < smallest) {
                smallest = myArray[j];
            }
            j++;
        }

        System.out.print("The smallest number is: " + smallest);
    }
}