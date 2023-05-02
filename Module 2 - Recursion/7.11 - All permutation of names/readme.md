# 7.11 LAB: All permutations of names

Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings). The program will read a list of one word names (until -1), and use a recursive method to create and output all possible orderings of those names separated by a comma, one ordering per line.

When the input is:

`Julia Lucas Mia -1`

then the output is (must match the below ordering):
```
Julia, Lucas, Mia 
Julia, Mia, Lucas
Lucas, Julia, Mia
Lucas, Mia, Julia
Mia, Julia, Lucas
Mia, Lucas, Julia
```
