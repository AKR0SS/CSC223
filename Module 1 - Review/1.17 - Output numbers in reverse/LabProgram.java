import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int MAX_SIZE = 20;
      int[] userList = new int[MAX_SIZE];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      /* Type your code here. */
      for (int i = 1; i <= numElements; i++) {
            userList[i] = scnr.nextInt();
      }
      
      for (int i = numElements; i > 0; i--) {
         System.out.print(userList[i] + ",");
      }
      
      System.out.println();
   }
}