import java.util.Arrays;
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {

        // ==========================================================
        // String Creation
        // Creates strings using String literal and new keyword.
        // ==========================================================
        String firstName = "Anamika";
        String lastName = new String("Meathani");

        System.out.println("My full name is " + firstName + " " + lastName);

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // == Operator
        // Compares object references.
        // ==========================================================
        String s1 = "Abc";
        String s2 = "Abc";
        String s3 = "abc";
        String s4 = "ABC";
        String s5 = "xyz";

        System.out.println("Answer of " + s1 + " == " + s2 + " is " + (s1 == s2));
        System.out.println("Answer of " + s1 + " == " + s3 + " is " + (s1 == s3));
        System.out.println("Answer of " + s1 + " == " + s4 + " is " + (s1 == s4));
        System.out.println("Answer of " + s1 + " == " + s5 + " is " + (s1 == s5));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // equals()
        // Compares the contents of two strings.
        // ==========================================================
        System.out.println("Answer of " + s1 + " equals " + s2 + " is " + (s1.equals(s2)));
        System.out.println("Answer of " + s1 + " equals " + s3 + " is " + (s1.equals(s3)));
        System.out.println("Answer of " + s1 + " equals " + s4 + " is " + (s1.equals(s4)));
        System.out.println("Answer of " + s1 + " equals " + s5 + " is " + (s1.equals(s5)));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // equalsIgnoreCase()
        // Compares strings ignoring case.
        // ==========================================================
        System.out.println("Answer of " + s1 + " equalsIgnoreCase " + s2 + " is " + (s1.equalsIgnoreCase(s2)));
        System.out.println("Answer of " + s1 + " equalsIgnoreCase " + s3 + " is " + (s1.equalsIgnoreCase(s3)));
        System.out.println("Answer of " + s1 + " equalsIgnoreCase " + s4 + " is " + (s1.equalsIgnoreCase(s4)));
        System.out.println("Answer of " + s1 + " equalsIgnoreCase " + s5 + " is " + (s1.equalsIgnoreCase(s5)));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // length() & charAt()
        // length() returns total characters.
        // charAt() returns character at given index.
        // ==========================================================
        System.out.println(firstName + " length is: " + firstName.length());
        System.out.println(lastName + " length is: " + lastName.length());

        System.out.println(firstName.charAt(5));
        System.out.println(lastName.charAt(2));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // next() vs nextLine()
        // next() reads one word.
        // nextLine() reads the complete line.
        // ==========================================================
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first string (next): ");
        String input1 = input.next();

        input.nextLine(); // Consume leftover newline

        System.out.print("Enter your second string (nextLine): ");
        String input2 = input.nextLine();

        System.out.println("First string : " + input1);
        System.out.println("Second string: " + input2);

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // isEmpty() & isBlank()
        // isEmpty() checks length == 0.
        // isBlank() checks if string is empty or only whitespaces.
        // ==========================================================
        String str1 = "";
        String str2 = "  ";

        System.out.println("str1 = \"" + str1 + "\"");
        System.out.println("str2 = \"" + str2 + "\"");

        System.out.println("str1.isEmpty(): " + str1.isEmpty());
        System.out.println("str1.isBlank(): " + str1.isBlank());

        System.out.println("str2.isEmpty(): " + str2.isEmpty());
        System.out.println("str2.isBlank(): " + str2.isBlank());

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // trim()
        // Removes leading and trailing whitespaces.
        // ==========================================================
        String newStr = "     Abc     ";

        System.out.println("String before trim = \"" + newStr + "\"");
        System.out.println("String after trim = \"" + newStr.trim() + "\"");

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // contains()
        // Checks if a string contains the given text.
        // ==========================================================
        String strNew = "This is java coding";

        System.out.println("Does \"" + strNew + "\" contain 'n'? " + strNew.contains("n"));
        System.out.println("Does \"" + strNew + "\" contain 'coding'? " + strNew.contains("coding"));
        System.out.println("Does \"" + strNew + "\" contain 'q'? " + strNew.contains("q"));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // substring()
        // Returns a portion of the string.
        // beginIndex is inclusive and endIndex is exclusive.
        // ==========================================================
        System.out.println("substring(0,6): " + strNew.substring(0, 6));
        System.out.println("substring(0,4): " + strNew.substring(0, 4));
        System.out.println("substring(0,12): " + strNew.substring(0, 12));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // startsWith() & endsWith()
        // Checks prefix and suffix of a string.
        // ==========================================================
        System.out.println("Starts with 'THIS'? " + strNew.startsWith("THIS"));
        System.out.println("Starts with 'This'? " + strNew.startsWith("This"));
        System.out.println("Ends with 'ing'? " + strNew.endsWith("ing"));
        System.out.println("Ends with 'xyz'? " + strNew.endsWith("xyz"));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // replace()
        // Replaces characters or substrings.
        // ==========================================================
        System.out.println("Replace 'a' with 'm': " + strNew.replace("a", "m"));
        System.out.println("Replace 'A' with 'a': " + strNew.replace("A", "a"));
        System.out.println("Replace 'p' with 's': " + strNew.replace("p", "s"));
        System.out.println("Replace 'i' with 'I': " + strNew.replace("i", "I"));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // toUpperCase() & toLowerCase()
        // Converts string to uppercase or lowercase.
        // ==========================================================
        String str = "This is java coding";

        System.out.println("Uppercase : " + str.toUpperCase());
        System.out.println("Lowercase : " + str.toLowerCase());

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // toCharArray()
        // Converts a String into a character array.
        // ==========================================================
        String name = "Anamika";
        char[] chr = name.toCharArray();

        // Concatenation calls Object.toString()
        System.out.println("Your Array is: " + chr);

        // println(char[]) prints characters
        System.out.println(chr);

        // Prints array elements
        System.out.println("Your Array is: " + Arrays.toString(chr));

        System.out.println("-------------------------------------------------------");

        // ==========================================================
        // split()
        // Splits a string into an array.
        // ==========================================================
        String sentence = "My,name,is,Anamika,Meathani,.";

        // Prints object reference
        System.out.println(sentence.split(","));

        // Prints array contents
        System.out.println(Arrays.toString(sentence.split(",")));

        input.close();
    }
}