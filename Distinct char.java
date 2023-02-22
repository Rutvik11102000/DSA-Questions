/*
 * Distinct char
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S find the length of the longest substring of S with all distinct characters.
Input
First line of input contains S

Constraints
1 <= |S| <= 100000
Output
Output a single integer, the length of the longest substring of S with all distinct characters.
Example
Sample input 1
dcbdd

Sample output 1
3

Sample input 2
bbcbb

Sample output 2
2
 */



 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the input string
        String s = input.nextLine();

        // Traverse the string using a sliding window approach
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, i - start + 1);
        }

        // Output the length of the longest substring with all distinct characters
        System.out.println(maxLength);
    }
}