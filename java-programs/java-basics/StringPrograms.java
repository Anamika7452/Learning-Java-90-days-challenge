import java.util.Scanner;

public class StringPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.nextLine();

        // Print Each Character of the string
        printStringCharacter(str);

        // Print length of String without Length()
        printLengthOfString(str);

        // Count vowels count in string
        countVowelsInString(str);

        // Reverse string
        System.out.println("Reverse of you string is: " + reverseString(str));

        // Check Palindrome
        checkPalindrome(str);

    }

    public static void printStringCharacter(String str) {
        for(int i=0; i<str.length();i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printLengthOfString(String str) {
       char[] charArray = str.toCharArray();
       int length = 0;
       for (char ch: charArray) {
           length++;
       }
       System.out.println("The length of string is: " + length);
    }

    public static void countVowelsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }

    public static String reverseString(String str) {
        String reverseStr = "";
        for(int i=(str.length() - 1); i>=0; i--) {
           reverseStr+=str.charAt(i);
        }
        return reverseStr;
    }


    public static void checkPalindrome(String str) {
        String reverseStr = reverseString(str);

        if(str.equals(reverseStr)) {
            System.out.println("Panlindrome!");
        } else{
            System.out.println("Not a Palindrome!");
        }

    }
}
