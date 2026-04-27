import  java.lang.*;

public class PatternProgram {
    public static void main(String[] args) {
        // call the method
        System.out.println("----------------------------------------------");
        pattern1();
        System.out.println("----------------------------------------------");
        pattern2();
        System.out.println("----------------------------------------------");
        pattern3();
        System.out.println("----------------------------------------------");
        pattern4();
        System.out.println("----------------------------------------------");
    }

    public static void pattern1() {
        for(int i = 1; i <= 5; i++) {        // rows
            for(int j = 1; j <= i; j++) {    // stars in each row
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }


    public static void pattern2() {
        for(int i = 1; i <= 5; i++) {        // rows
            for(int j = 5; j >= i; j--) {    // stars in each row
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }

    public static void pattern3() {
        for(int i = 1; i <= 5; i++) {
            // print spaces
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}