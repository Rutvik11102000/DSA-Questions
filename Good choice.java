/*
 * Good choice
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S of size N and set of K english letters. You have to choose a substring such that each character in the substring belongs to that set of letters.
Count the number of substrings which can be chosen.
Input
The first line contains two space separated integers N and K — the length of the string S and the number of letters in the set.

The second line contains the string S consisting of exactly N lowercase Latin letters.

The third line contains K space separated distinct lowercase Latin letters c1, c2, …, ck.

Constraint:-
1 <= N <= 10^5
1 <= K <= 26
Output
Print a single number — the number of substrings of s that can be chosen using only available letters c1, c2, …, ck.
Example
Input:
7 2
abacaba
a b

Output:
12
 */



 import java.util.*;

 public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         // Read the length of the string and the set of letters
         int n = input.nextInt();
         int k = input.nextInt();
 
         // Read the string and the set of letters
         String s = input.next();
         Set<Character> set = new HashSet<Character>();
         for (int i = 0; i < k; i++) {
             set.add(input.next().charAt(0));
         }
 
         // Traverse the string using a sliding window approach
         int count = 0;
         int start = 0;
         for (int i = 0; i < n; i++) {
             char ch = s.charAt(i);
             if (!set.contains(ch)) {
                 start = i + 1;
             } else {
                 count += i - start + 1;
             }
         }
 
         // Output the number of substrings that can be chosen
         System.out.println(count);
     }
 }
