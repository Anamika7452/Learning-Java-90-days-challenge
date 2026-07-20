import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();

        int[] myArray = new int[size];
        int i = 0;

        while (i < size) {
            System.out.print("Please enter your number: ");
            myArray[i] = input.nextInt();
            i++;
        }

        int largest = myArray[0];
        int j = 1;

        while (j < size) {
            if (myArray[j] > largest) {
                largest = myArray[j];
            }
            j++;
        }

        System.out.print("The largest number is: " + largest);
    }
}