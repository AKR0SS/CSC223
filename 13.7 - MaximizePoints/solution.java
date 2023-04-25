import java.util.*;
import java.io.*;

public class Main {
   public long maxPoints(String input){
      int numOfBags = 0;
      int numOfRemovableMarbles = 0;
      int remaining = 0;
      long points = 0;
      
      try {
         Scanner scanner = new Scanner(new File(input));
         numOfBags = scanner.nextInt();
         numOfRemovableMarbles = scanner.nextInt();
         
         // Fill Array
         int[] bags = new int[numOfBags];
         
         for (int i = 0; i < numOfBags; i++) {
            bags[i] = scanner.nextInt();
         }
         Arrays.sort(bags);
         
         //System.out.println("Sorted Array: " + Arrays.toString(bags));
         
         // Assign
         remaining = numOfRemovableMarbles;
         
         //System.out.println("Remaining pulls: " + remaining + " | Array Size: " + (bags.length));
         //System.out.println("___________");
         
         while (remaining > 0) {
            int removed = 0;
            int max = Arrays.stream(bags).max().getAsInt();
            
            for (int i = 0; i < bags.length; i++) {
               if (bags[i] == max) {
                  removed = bags[i];
                  bags[i] = bags[i] - 1;
                  //System.out.println("Removed Marble from bag " + i + ", adding " + removed + " points | Remaining pulls: " + remaining);
                  break;
               }
            }
            
            
            points += removed;
            remaining--;
         }
         
         scanner.close();
         return points;
      }
      catch (FileNotFoundException e) {
         return -1;
      }
   }
}
