# 12.14 NVCC Lab: Evaluating the Performance of Binary Search Tree

The major advantage of binary search trees over other data structures is that the related sorting algorithms, search algorithms, insertion, and deletion can be very efficient when balanced. A binary search tree is an appropriate structure for many of the same applications discussed previously in conjunction with other collection structures, especially those providing sorted lists. The special advantage of using a binary search tree is that it facilitates searching while conferring the benefits of linking the elements. It provides the best features of both the sorted array-based list and the linked list. Similar to a sorted array-based list, it can be searched quickly, using a binary search. Similar to a linked list, it allows insertions and removals without having to move large amounts of data. Thus, a binary search tree is particularly well suited for applications in which processing time to insert, add and delete must be minimized. However, all aforementioned advantages are completed depend on how a tree was created. For example, in a balanced BST with N nodes, its minimum height is O(log n), it takes at maximum O(log n) comparisons to find a particular node. However, in the worst-case scenario, it takes up to O(n) comparisons to find a particular node. The following table summarizes the number of Nodes, height, and the number of comparisons to search a particular node in a balanced tree and the worst case.
Example of Searching a Node in a Balanced Tree and the Worst Case

<table>
<tr>
    <th rowspan="2"> Number of Nodes </th>
    <th colspan="2"> Height of the Tree </th>
    <th colspan="2"> Number of Comparisons </th>
</tr>
<tr>
    <th> Balanced Tree </th>
    <th> Worst Case </th>
    <th> Balanced Tree </th>
    <th> WorstCase </th>
</tr>
<tr>
    <td>3</td>
    <td>1</td>
    <td>3</td>
    <td>2</td>
    <td>3</td>
</tr>
<tr>
    <td>7</td>
    <td>2</td>
    <td>7</td>
    <td>3</td>
    <td>7</td>
</tr>
<tr>
    <td>1024</td>
    <td>9</td>
    <td>1024</td>
    <td>10</td>
    <td>1024</td>
</tr>
<tr>
    <td>4096</td>
    <td>11</td>
    <td>4096</td>
    <td>12</td>
    <td>4096</td>
</tr>
</table>

Your Tasks:

For this assignment, you are required to design experiments to evaluate the relationship between BST tree height (h) and the number of comparisons to find a particular node in a tree.
