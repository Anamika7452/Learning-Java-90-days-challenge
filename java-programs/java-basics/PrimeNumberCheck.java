import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        long num = input.nextLong();
        boolean isPrime = checkPrime(num);

        if(isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }

    public static boolean checkPrime(long num) {
        int i = 2;
        while(i < num) {
            if(num % i == 0) {
               return false;
            }
            i++;

        }
        return  true;
    }

}
