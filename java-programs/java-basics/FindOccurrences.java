import java.util.Scanner;

public class FindOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] myArray = new int[size];
        int i = 0;
        while (i<size) {
            System.out.print("Please Enter Your Number: ");
            myArray[i] = input.nextInt();
            i++;
        }
        System.out.print("Please Enter number you want to query: ");
        int num = input.nextInt();
        int j = 0;
        int counter = 0;
        while (j<size) {
            if (myArray[j] == num) {
                counter+=1;
            }
            j++;
        }
        System.out.print("Your number Appears " + counter + " times");

    }
}
