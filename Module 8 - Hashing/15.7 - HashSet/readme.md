# 15.7 LAB: Unique random integers (HashSet)

Given integer inputs howMany and maxNum, generate an array of howMany unique random integers from 0 to maxNum (exclusive).

The structure of the program is:

- main() calls uniqueRandomInts() with arguments howMany and maxNum.
- uniqueRandomInts() returns an array of howMany unique random integers.
- The required output is already provided in main() and printNums().

Complete uniqueRandomInts(), which generates random integers until howMany unique integers have been collected in array nums.

Hint: If a generated number is new, add the number to the array nums and the set alreadySeen. If the number has been seen before, increment the static variable retries and generate another random integer.

Note: For testing purposes, a random number generator object is created with a fixed seed value (29) in uniqueRandomInts(). Refer to the textbook section on Random numbers to learn more about pseudo-random numbers.

Ex: When the input is:
```
5 8
```
the output is
```
5 0 1 7 3   [3 retries]
```
