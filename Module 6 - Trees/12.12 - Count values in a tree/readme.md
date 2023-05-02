# 12.12 NVCC Lab: Count values in a tree

Please refer to the TreeNode.java and MyTree.java and implement the method as specified below:

public int countAboveBenchmark(MyTree mt, int val)

This method takes a MyTree and a benchmark value (val) as parameters and count and return how many numbers in the tree are greater than or equals to the benchmark value.

For example, given the following tree,
```
         ___[15]
        /       \
      [9]        [24]
     /  \
   [3]   [12]
  /
[0]
```
calling: countAboveBenchmark(mt, 13) should return 2, because there are two numbers: 15 and 24 are greater than 13
```
=======TreeNode.java=======
public class TreeNode implements Comparable<TreeNode>{
   private int data;
   private TreeNode left;
   private TreeNode right;

   public TreeNode(int data){
      this.data=data; 
      left=right=null; 
   }

   public int getData(){
      return data;
   }
   public TreeNode getLeft(){
      return left;
   }
   public TreeNode getRight(){
      return right;
   }
   public void setData(int data){
      this.data = data;
   }
   public void setLeft(TreeNode left){
      this.left = left;
   }
   public void setRight(TreeNode right){
      this.right = right;
   }
   public int compareTo(TreeNode node){
      return data-node.getData();
   }
}

=========MyTree.java=======
public class MyTree{
   private TreeNode root;
   public MyTree(){
      root=null;
   } 
   public TreeNode getRoot(){ 
        return root;
   }
   //all other methods are omitted
}
```
