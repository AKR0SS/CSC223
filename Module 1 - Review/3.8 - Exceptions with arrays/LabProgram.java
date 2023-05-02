import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
      /* Type your code here. */
      try {
         System.out.println("Name: " + names[index]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         String closestName;
         System.out.println("Exception! Index " + index + " out of bounds for length " + names.length);
         
         if (index < 0) {
            closestName = names[0];
         }
         else {
            closestName = names[names.length - 1];
         }
         System.out.println("The closest name is: " + closestName);
      }
   }
}
