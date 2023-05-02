# 11.14 NVCC Lab: Parentheses Match

A fairly common algorithmic task is to process some data set in reverse order. Typically you put some data in temporary storage, then take it out, always in a Last-In, First-Out (LIFO) order. A stack is the data structure that was invented to help manage this process. A real-world example of a stack is the dispenser of the trays in the lunch room. You always take the top tray from the top, never from the middle or the bottom. Similarly, the lunch workers always put trays on the top, never at the middle or bottom. For this problem, you are going to determine whether the grouping symbols--parentheses, brackets, curly braces, etc.--in an arithmetic expression, such as [(5+7)*3], match each other.

Here are all matching group symbols: (), [], {}, and <>. For this problem, you can ignore all digits and operands. Study the following cases to examine how matching symbols are evaluated.

| Parentheses | Match |
| ----------- | ----- |
| 5+7         | true  |
| (5+7)       | true  |
| )5+7(       | false |
| <{5+7}*3>   | true  |
| ((5+7)*3)   | true  |
| [(5+7)*]3   | true  |
| (5+7)*3     | true  |
| 5+(7*3)     | true  |
| ((5+7)*3    | false |
| [(5+7]*3)   | false |
| [(5+7)*3])  | false |
| ([(5+7)*3]  | false |
| < 50 +{ 37 - {3*2}} + [ 19 + {8*9}]> | true |

Please implement the following method:
```
public static boolean checkParen(String s){
         //implement this method to return true if grouping symbols match each other, otherwise return false.
 }
```
