# 11.13 LAB: Palindrome (Deque)

A palindrome is a string that reads the same backwards and forwards. Use a deque to implement a program that tests whether a line of text is a palindrome. The program reads a line, then outputs whether the input is a palindrome or not.

Ex: If the input is:
```
senile felines!
```
the output is:
```
Yes, "senile felines!" is a palindrome.
```
Ex: If the input is:
```
rotostor
```
the output is:
```
No, "rotostor" is not a palindrome.
```
Ignore punctuation and spacing. Assume all alphabetic characters will be lowercase.

Special case: A one-character string is a palindrome.

Hint: The deque must be a Deque of Characters, but ordinary chars will be automatically converted to Characters when added to the deque.
