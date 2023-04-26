/**
*
*
* MyIntBSTTree.txt: the template file of MyIntBSTTree.java
* Student tasks: implement tasks #1 and #2 as specified in this file
*/

import java.util.*;

public class MyIntBSTTree{  
   private Node root;
   private int[] arr;
   
   public MyIntBSTTree(){
      root = null;
      arr = null;
   }
   
   public MyIntBSTTree(int[] arr) {
      root = null;
      this.arr = arr;
   }
   
   public int height() {
      // *** Student task ***  
      /* Requirements: 
        The height of a binary tree is the largest number of edges in a path from the root node to a leaf node. 
        Essentially, it is the height of the root node. Note that if a tree has only one node, then that node 
        is at the same time the root node and the only leaf node, so the height of the tree is 0, similary, 
        the height of a tree with only two nodes is 1. Implement this method to return height of the tree

       *** Enter your code below *** 
      */
      return getHeight(root) - 1;
   }
   
   private int getHeight(Node temp) {
      int max = 0;
      int leftHeight = 0;
      int rightHeight = 0;
      
      if (temp.getLeft() != null) leftHeight = getHeight(temp.getLeft());
      if (temp.getRight() != null) rightHeight = getHeight(temp.getRight());
      
      if (leftHeight > rightHeight)
         max = leftHeight;
      else
         max = rightHeight;
      
         
      return max + 1;
   }
  
   public int comparisons(Node node) {
      // *** Student task ***  
      /* Requirements: 
        Count and return how many comparisons performed to search for the argument node

       *** Enter your code below *** 
      */
      int comparisons = 0;
      int value = node.getData();
      Node cursor = root;
      
      while (cursor != null) {
         if (cursor.getData() == value) {
            break;
         }
         else if (cursor.getData() < value) {
            comparisons++;
            cursor = cursor.getRight();
         }
         else {
            comparisons++;
            cursor = cursor.getLeft();
         }
      }
     
      return comparisons;
   }
   
   public int comparisons(int val) {
      // *** Student task ***  
      /* Requirements: 
        Overloaded method - Count and return how many comparisons performed to search for the node whose data equals the argument val.

       *** Enter your code below *** 
      */
      return comparisons(new Node(val));
   }

   public MyIntBSTTree buildBalancedTree() {
      //This method builds a balanced tree with values from the int arr and returns the tree.
      int[] arr = Util.toArray(root);
      MyIntBSTTree tree=new MyIntBSTTree();
      
      arr = Arrays.copyOf(arr, arr.length);
      Arrays.sort(arr);
      
      int mid = (arr.length - 1) / 2;
      
      tree.insertNode(arr, 0, arr.length - 1);
      return tree;
   }
   private void insertNode(int[] arr, int low, int high) {
      if (low == high) {
         add(arr[low]);
      }
      else if (low < high) {
         int mid = (low + high) / 2;
         add(arr[mid]);
         insertNode(arr, low, mid - 1);
         insertNode(arr, mid + 1, high);
      }
   }
   public MyIntBSTTree buildWorstTree() {
      //Build and return a tree whose height is arr.length - 1
      int[] arr = Util.toArray(root);
      MyIntBSTTree tree = new MyIntBSTTree();
      
      arr = Arrays.copyOf(arr, arr.length);
      Arrays.sort(arr);
      
      for(int i = 0; i < arr.length; i++){
         tree.add(arr[i]);
      }
      return tree;
   }
   public MyIntBSTTree buildTree(int[] arr){
      //This method builds a tree with values from the int arr and returns the tree.
      //You may simply add all values to the tree in the same sequence as in the int arr
      MyIntBSTTree tree=new MyIntBSTTree();
      
      for(int i = 0; i < arr.length; i++){
         tree.add(arr[i]);
      }
      return tree;
   }
   
   // **** DO NOT MODIFY CODE BEYOND THIS POINT ***
   public Node getRoot(){
      return root;
   }
   public void add(int data) {
       root = addHelper(root, data);
   }

   private Node addHelper(Node node, int data) {//add node helper
       if (node == null){
          node = new Node(data);
       }else if (data <= node.getData()){
           node.setLeft(addHelper(node.getLeft(), data));
       }else{
           node.setRight(addHelper(node.getRight(), data));//System.out.println(data);
       }
       return node;
   }
}
