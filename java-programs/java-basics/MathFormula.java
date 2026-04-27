
import  java.lang.*;
import java.util.Scanner;

public class MathFormula {
    public static void main(String[] args) {
        System.out.println("----------Perimeter of rectangle----------");
        perimeterOfRectangle();
        System.out.println("----------Area of Triangle----------");
        areaOfTriangle();
        System.out.println("----------Simple Interest----------");
        simpleInterest();
    }

    public static void perimeterOfRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your length: ");
        float length = input.nextFloat();
        System.out.print("Enter your breadth: ");
        float breadth = input.nextFloat();
        float perimeter = 2*(length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

    public static void areaOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your base: ");
        float base = input.nextFloat();
        System.out.print("Enter your height: ");
        float height = input.nextFloat();
        float area = 0.5f*(base*height);
        System.out.println("Area of triangle: " + area);
    }

    public static void simpleInterest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle: ");
        int principle = input.nextInt();
        System.out.print("Enter your rate: ");
        int rate = input.nextInt();
        System.out.print("Enter your time: ");
        int time = input.nextInt();
        int simpleInterest = (principle*rate*time)/100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
