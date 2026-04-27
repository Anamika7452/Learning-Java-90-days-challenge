import  java.lang.*;
import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " To 90 days Java Learning Journey");
    }
}
