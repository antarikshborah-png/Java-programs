import java.util.*;

public class Count_lower_upper_digit_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            }
        }

        System.out.println("Lowercase letters: " + lowerCount);
        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);

        sc.close();
    }
}