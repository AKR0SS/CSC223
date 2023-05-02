import java.util.Queue;
import java.util.LinkedList;

public class Main{
   public int countAboveBenchmark(MyTree mt, int val){
      //TO DO: count and return how many numbers in the tree are greater than  or equals to the benchmark value.
      int count = 0;
      TreeNode root = mt.getRoot();
      Queue<TreeNode> queue = new LinkedList<>();
      
      System.out.println("for val: " + val);
      
      queue.add(root);
      
      if (root.getData() >= val) count++;
      
      while (!queue.isEmpty()) {
         TreeNode temp = queue.poll();
         
         // if (temp.getLeft() != null && temp.getRight() != null)
         // count++;
         
         if (temp.getLeft() != null) {
            System.out.println("Comparing " + temp.getLeft().getData());
            if (temp.getLeft().getData() >= val) {
               System.out.println(" - Left node: " + temp.getLeft().getData() + " > " + val);
               count++;
            }
            
            queue.add(temp.getLeft());
         }

         // Enqueue right child 
         if (temp.getRight() != null) {
            System.out.println("Comparing " + temp.getRight().getData());
            if (temp.getRight().getData() >= val) {
               System.out.println(" - Right node: " + temp.getRight().getData() + " > " + val);
               count++;
            }
            
            queue.add(temp.getRight());
         }
      }
      
      return count;
   }
}
