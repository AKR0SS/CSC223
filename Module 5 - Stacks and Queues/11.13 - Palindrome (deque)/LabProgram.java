import java.util.Scanner;
import java.util.Stack;

public class LabProgram {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int j;
        String line;

        /* Type your code here. */
        line = scnr.nextLine();

        if (isPalindrome(line))
            System.out.printf("Yes, \"%s\" is a palindrome.\n", line);
        else
            System.out.printf("No, \"%s\" is not a palindrome.\n", line);
    }

    public static boolean isPalindrome(String nInput) {
        String input = nInput.replaceAll("\\p{P}", "").replaceAll("\\s", "");

        if (input.length() == 1) return true; // Exception guard clause

        StringBuilder output = new StringBuilder();
        Stack<Character> palindrome = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            palindrome.add(input.charAt(i));
        }

        for (int i = palindrome.toArray().length; i > 0; i--) {
            output.append(palindrome.pop());
        }

        return input.equalsIgnoreCase(output.toString());
    }
}
