import java.util.*;

public class StringFunction {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);

        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversedStr);

        // Check if the string is a palindrome
        boolean isPalindrome = str.equalsIgnoreCase(reversedStr);
        System.out.println("Is palindrome: " + isPalindrome);

        sc.close();
    }
    
}
