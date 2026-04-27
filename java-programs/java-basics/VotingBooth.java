import java.util.Scanner;

public class VotingBooth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        canVote(name, age);

        seatAllocation(name, age);
    }

    public static void canVote(String name, int age) {
        System.out.println("Checking If you can vote or not..........");

        if (age >= 18) {
            System.out.println(name + " yes you are eligible for voting");
        } else {
            System.out.println(name + " no you are not eligible for voting");
        }
    }

    public static void seatAllocation(String name, int age) {
        System.out.println("Checking if you have a seat assigned to you...");

        if (age <= 18 || age >= 50) {
            System.out.println(name + " yes you have a seat assigned.");
        } else {
            System.out.println(name + " no you are not eligible for a seat.");
        }
    }
}