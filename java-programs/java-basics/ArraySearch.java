import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {10,20,30,40,50,60,70};
        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr, num);
        if(isFound) {
            System.out.println("Your number was found in the list");
        } else {
            System.out.println("Your number was not found in the list");
        }
    }

    public static boolean isFound(int[] myArr, int num) {
        int index = 0;

        while(index < myArr.length) {
            if(myArr[index] == num) {
                return true;
            }
            index++;
        }
        return  false;
    }
}
