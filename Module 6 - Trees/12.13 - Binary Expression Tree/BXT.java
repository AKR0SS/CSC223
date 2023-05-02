/**
*
* Student tasks: implement tasks as specified in this file
*
* Note: BXT Represents a binary expression tree.
* BXT can build itself from a postorder expression.  
* It can evaluate and print itself. It also prints an inorder string and a preorder string.  
*/

import java.util.*;

class BXT{
   private TreeNode root;

   public BXT(){
      root = null;
   }
   public TreeNode getRoot(){
      return root;
   }
   
   public void buildTree(String str){
      // *** Student task ***  
      /* 
	     The argument string is in postfix notation. 
        Build the tree as specified in the document 
        *** Enter your code below ***
      */
      String[] strArray = str.split(" ");
      Stack<TreeNode> stack = new Stack<>();

      for (String token : strArray) {
         if (isOperator(token)) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            stack.push(new TreeNode(token, left, right));
         }
         else {
            stack.push(new TreeNode(token));
         }
      }

      root = stack.pop();
 
   }
   
   /* EVALUATION */
   public double evaluateTree(){
      // *** Student task ***  
      /* 
	     Do this recursively.  If the node is an operator, recursively evaluate the left child 
        and the right child, and return the result.  Else the node is a number, so it can 
        be converted into a double, and returned. 
        *** Enter your code below ***
      */
      return evaluateTree(root); //replace it with yours
   }
   
   private double evaluateTree(TreeNode node) {
      if (isOperator(node.getData())) {
         double leftResult = evaluateTree(node.getLeft());
         double rightResult = evaluateTree(node.getRight());

         switch (node.getData()) {
            case "+": return leftResult + rightResult;
            case "-": return leftResult - rightResult;
            case "*": return leftResult * rightResult;
            case "/": return leftResult / rightResult;
            case "%": return leftResult % rightResult;
         }
      }
      else {
         return Double.parseDouble(node.getData());
      }
      
      return 0;
   }
   
   /* INFIX */
   public String infix(){ 
      // *** Student task ***  
      /* 
	   Infix is characterized by the placement of operators between operands; 
        *** Enter your code below ***
      */
      return infix(root) + " "; // replace it with yours
   }
   
   private String infix(TreeNode node) {
      if (node == null) return "";
      
      String left  = infix(node.getLeft());
      String right = infix(node.getRight());
      String data  = node.getData();
      
      if (isOperator(data))
         return left + " " + data + " " + right;
      else
         return data;
   }

   /* PREFIX */
   public String prefix(){
      // *** Student task ***  
      /* 
	    Prefix expression notation requires that all operators precede the two operands that they work on; 
        *** Enter your code below ***
      */
      // prefix = prefix.substring(0, 0) + "" + prefix.substring(1);
      return prefix(root); // replace it with yours
   }
   
   private String prefix(TreeNode node) {
      if (node == null) return "";

      String data  = node.getData();
      String left  = prefix(node.getLeft());
      String right = prefix(node.getRight());

      return data + " " + left + "" + right;
   }

   /* POSTFIX */
   public String postfix(){
      // *** Student task ***  
      /* 
	    Postfix requires that its operators come after the corresponding operands
        *** Enter your code below ***
      */
      String postfix = postfix(root);
      postfix = postfix.substring(0, 0) + "" + postfix.substring(1);
      return postfix + " "; // replace it with yours
   }
   
   private String postfix(TreeNode node) {
      if (node == null) return "";
      
      String data  = node.getData();
      String left  = postfix(node.getLeft());
      String right = postfix(node.getRight());

      return left + "" + right + " " + data;
   }


   private boolean isOperator(String token) {
      return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%");
   }
}