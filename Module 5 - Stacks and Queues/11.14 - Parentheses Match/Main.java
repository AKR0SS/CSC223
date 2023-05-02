import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine().replaceAll("\\s", "");

        if (checkParen(input))
            System.out.println("\nIt does match.");
        else
            System.out.println("\nIt does not match!");
    }

    public static boolean  checkParen(String s) {
        //implement this method to return true if grouping symbols match
        //each other, otherwise return false.

        /* Type your code here. */
        Stack<Character> symbols = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{' || c == '<') {
                symbols.push(c);
                continue;
            }
            else if (c != ')' &&  c != ']' && c != '}' && c != '>') {
                continue;
            }

            if (symbols.isEmpty()) return false;

            switch (c) {
                case ')':
                    if (symbols.pop() != '(') return false;
                    break;
                case ']':
                    if (symbols.pop() != '[') return false;
                    break;
                case '}':
                    if (symbols.pop() != '{') return false;
                    break;
                case '>':
                    if (symbols.pop() != '<') return false;
                    break;
            }
        }

        return symbols.isEmpty();
    }
}