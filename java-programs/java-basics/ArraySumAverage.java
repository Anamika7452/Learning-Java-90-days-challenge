import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] myArray = new int[size];
        int sum = 0;
        int i = 0;
        while (i<size) {
            System.out.print("Please Enter Your Number: ");
            myArray[i] = input.nextInt();
            sum += myArray[i];
            i++;
        }

        System.out.println("Sum of you Elements is: "+ sum);
        System.out.println("Average of you Elements is: "+ sum/size);


    }
}
