import java.util.*;
import java.io.*;

public class Main {
   public static int countConnectedComponents(String fileName){
      ArrayList<int[]> edge = new ArrayList<>();
      int connectedComponents = 0;
      
      
      try {
         // Read File
         Scanner scanner = new Scanner(new File(fileName));
         
         while (scanner.hasNext()) {
            int[] pair = {scanner.nextInt(), scanner.nextInt()};
            edge.add(pair);
         }
         
         scanner.close();
         
         // Count Nodes
         for (int[] arr : edge) System.out.println(Arrays.toString(arr));
         
         int size = edge.size() / 2;
         int[] root = new int[size];
         for (int i = 0; i < size; i++) {
            root[i] = i;
         }
         
         connectedComponents = size;
         for (int i = 0; i < edge.size(); i++) {
            int x = edge.get(i)[0]; // Returns the int[] and get's element [0]
            int y = edge.get(i)[1]; // Returns the int[] and get's element [1]
            
            // DID NOT FINISH I'VE NO CLUE WHAT TO DO
         }
         
         return connectedComponents;
      }
      catch (FileNotFoundException e) {
         return -1;
      }
   }
}
