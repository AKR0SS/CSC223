import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
  public static void printNumPattern(int input, int sub) {

        if (input < 0) {
            System.out.print(input + " ");
            return;
        }

        System.out.print(input + " ");
        printNumPattern(input - sub, sub);

        // This output is magical wtf
        System.out.print(input + " ");
    }
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
} 