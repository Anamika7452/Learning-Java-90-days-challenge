import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        String firstName = "Anamika";
        String lastName = new String("Meathani");
        System.out.println("My full name is " + firstName + " " + lastName);
        System.out.println(firstName + " length is: "+ firstName.length() + " " + lastName + " length is: "+lastName.length());
        System.out.println(firstName.charAt(5));
        System.out.println(lastName.charAt(2));

        System.out.println("-------------------------------------------------------");

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

        System.out.println("Answer of " + s1 + " equals " + s2 + " is " + (s1.equals(s2)));
        System.out.println("Answer of " + s1 + " equals " + s3 + " is " + (s1.equals(s3)));
        System.out.println("Answer of " + s1 + " equals " + s4 + " is " + (s1.equals(s4)));
        System.out.println("Answer of " + s1 + " equals " + s5 + " is " + (s1.equals(s5)));

        System.out.println("-------------------------------------------------------");

        System.out.println("Answer of " + s1 + " equals ignore case " + s2 + " is " + (s1.equalsIgnoreCase(s2)));
        System.out.println("Answer of " + s1 + " equals ignore case " + s3 + " is " + (s1.equalsIgnoreCase(s3)));
        System.out.println("Answer of " + s1 + " equals ignore case " + s4 + " is " + (s1.equalsIgnoreCase(s4)));
        System.out.println("Answer of " + s1 + " equals ignore case " + s5 + " is " + (s1.equalsIgnoreCase(s5)));

        System.out.println("-------------------------------------------------------");


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first string (next): ");
        String input1 = input.next();

        input.nextLine();

        System.out.print("Enter your second string (nextLine): ");
        String input2 = input.nextLine();

        System.out.println("First string : " + input1);
        System.out.println("Second string: " + input2);

        System.out.println("-------------------------------------------------------");

        String str1 = "";
        String str2 = "  ";

        System.out.println("str1 = \"" + str1 + "\"");
        System.out.println("str2 = \"" + str2 + "\"");

        System.out.println("str1.isEmpty(): " + str1.isEmpty());
        System.out.println("str1.isBlank(): " + str1.isBlank());

        System.out.println("str2.isEmpty(): " + str2.isEmpty());
        System.out.println("str2.isBlank(): " + str2.isBlank());

        System.out.println("-------------------------------------------------------");

        String newStr = "     Abc     ";
        System.out.println("string before trim = \"" + newStr + "\"");
        System.out.println("string after trim = \"" + newStr.trim() + "\"");
    }
}
