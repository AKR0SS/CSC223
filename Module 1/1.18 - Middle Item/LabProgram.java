import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      

      /* Type your code here. */
      int mid = 0;
      int i = 0;
      
      while (i < 9 && scnr.hasNextInt()) {
         userValues[i] = scnr.nextInt();
         i++;
      }
      
      if (i == 9 && scnr.nextInt() != -1) {
         System.out.println("Too many numbers");
      }
      else {
         i--;
         System.out.println("Middle item: " + userValues[i / 2]);
      }
   }
}
