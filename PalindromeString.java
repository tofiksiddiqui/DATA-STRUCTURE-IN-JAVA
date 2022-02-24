import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reveString = "";
        System.out.println("Enter String : ");
        String nameString = scanner.nextLine();
        int strLength = nameString.length();
        for (int i = (strLength - 1); i >= 0; i--) {
            reveString = reveString + nameString.charAt(i);
        }

        System.out.println("Reverse String Is :" + reveString);

        if (nameString.toLowerCase().equals(reveString.toLowerCase())) {
            System.out.println("Given String is Palindrome :  [" + nameString + "]");
        } else {
            System.out.println("Given String is not Palindrome :  [" + nameString + "]");
        }

    }
}
