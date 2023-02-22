/*
 * Pair Hate (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S you have to remove all pairs of identical letters, which are consecutive. If after the removal there appear new pairs, remove them as well. Repeat this untill no adjacent letter in the string is same.
Note that deleting of the consecutive identical letters can be done in any order, as any order leads to the same result.
Input
The input data consists of a single string S.

Constraints:
1 <= |S| <= 100000
S contains lowercase english letters only.
Output
Print the given string after it is processed. It is guaranteed that the result will contain at least one character.
Example
Sample Input
hhoowaaaareyyoouu

Sample Output
wre

Explanation:
First we remove "hh" then "oo" then "aa" then "yy" then "oo" then "uu" and we are left with "wre".
Now we cannot remove anything.

Sample Input:-
abcde

Sample Output:-
abcde

Sample Input:-
abcddcb

Sample Output:-
a
 */




 import java.util.*;

 public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String s = input.nextLine();
         
         Stack<Character> stack = new Stack<>();
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (!stack.isEmpty() && stack.peek() == c) {
                 stack.pop();
             } else {
                 stack.push(c);
             }
         }
         
         StringBuilder sb = new StringBuilder();
         for (char c : stack) {
             sb.append(c);
         }
         System.out.println(sb.toString());
     }
 }
