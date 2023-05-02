# 12.13 NVCC Lab: Binary Expression Tree

A binary expression tree is a specific kind of a binary tree used to represent expressions. The leaves of the binary expression tree are operands, and the interior nodes contain operators. Assume the possible operators including '+', '-', '*', '/', and '%' and operands are numerical data. The following figures illustrate binary expression trees for the expressions with different notations:

<table>
<tr>
<td> Example 1 </td> <td> Example 2 </td> <td> Example 3 </td>
<tr>
<td>

```java
Postfix Exp: 14 -5 /

  BXT:
    [/]
   /  \
[14]   [-5]

Infix order: 14 / -5
Prefix order:  / 14 -5
Evaluates to -2.8
-----------------------
```

</td>
<td>

```java
Postfix Exp: 20 3 -4 + *

   BXT:
    ___[*]
   /     \
[20]      [+]
         /  \
       [3]   [-4]

Infix order: 20 * 3 + -4
Prefix order: * 20 + 3 -4
Evaluates to -20.0
-----------------------
```

</td>
<td>

```java
Postfix	 Exp: 2 3 + 5 / 4 5 - *

    BXT:
         ___[*]_____ 
        /           \
      [/]__          [-]
     /     \        /  \
   [+]      [5]   [4]   [5]
  /  \
[2]   [3]

Infix order: 2 + 3 / 5 * 4 -5
Prefix order: * / + 2 3 5 - 4 5 
Evaluates to -1.0
```

</td>
</table>

Your Tasks:

For this assignment, you will build a binary expression tree, display it, and evaluate it. You will encapsulate the behavior in a BXT class. The driver class, tree node, and the BXT class are provided. Please implement appropriate methods in BXT class to build, display, and evaluate a tree.

Requirements for each method:

Build a BXT: You need to change the string into a tree. The argument string is in postfix notation.

Display Infix and Prefix orders

Infix is characterized by the placement of operators between operands;

Prefix expression notation requires that all operators precede the two operands that they work on;

Postfix requires that its operators come after the corresponding operands. See following examples:

## Infix, Prefix, and Postfix Orders

| Infix Expression | Prefix Expression | Postfix Expression|
| ---------------- | ----------------- | ----------------- |
| A + B            | + A B             | A B +             |
| A + B * C        | + A * B C         | A B C * +         |

## Evaluating the Expression

Do this recursively. If the node is an operator, recursively evaluate the left child and the right child, and return the result. Else the node is a number, so it can be converted into a double, and returned.

Requirements for your application:

Please design an application to meet the following specific methods:

- buildTree(String str) : The argument string is in postfix notation. Build the tree as specified in the document-refer to examples 1 ,2 and 3;
- eveluateTree(): Do this recursively. If the node is an operator, recursively evaluate the left child and the right child, and return the result. Else the node is a number, so it can be converted into a double, and returned.
- infix(): Infix is characterized by the placement of operators between operands;
- prefix(): Prefix expression notation requires that all operators precede the two operands that they work on;
- posfix(): Postfix requires that its operators come after the corresponding operands
