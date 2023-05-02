# 8.12 LAB: Binary search

Binary search can be implemented as a recursive algorithm. Each call makes a recursive call on one-half of the list the call received as an argument.

Complete the recursive method binarySearch() with the following specifications:

1. Parameters:
    - a target integer
    - an ArrayList of integers
    - lower and upper bounds within which the recursive call will search
2. Return value:
    - the index within the ArrayList where the target is located -1 if target is not found

The template provides main() and a helper function that reads an ArrayList from input.

The algorithm begins by choosing an index midway between the lower and upper bounds.

1. If target == integers.get(index) return index
2. If lower == upper, return -1 to indicate not found
3. Otherwise call the function recursively on half the ArrayList parameter:
    - If integers.get(index) < target, search the ArrayList from index + 1 to upper
    - If integers.get(index) > target, search the ArrayList from lower to index - 1

The ArrayList must be ordered, but duplicates are allowed.

Once the search algorithm works correctly, add the following to binarySearch():

4. Count the number of calls to binarySearch().
5. Count the number of times when the target is compared to an element of the ArrayList. Note: lower == upper should not be counted.

Hint: Use a static variable to count calls and comparisons.

The input of the program consists of:

1. the number of integers in the ArrayList
2. the integers in the ArrayList
3. the target to be located

Ex: If the input is:
```
9
1 2 3 4 5 6 7 8 9
2
```
the output is:
```
index: 1, recursions: 2, comparisons: 3
```
