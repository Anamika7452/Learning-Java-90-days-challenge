import  java.lang.*;
import java.util.Scanner;

public class GreetUserProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Good Morning " + name);
    }
}
