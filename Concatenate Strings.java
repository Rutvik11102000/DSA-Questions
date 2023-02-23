/*
 * Concatenate Strings
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N Strings of length L each. Find the lexicographically smallest string that can be formed after concatenating all the strings in some order.
Input
The first line of input contains two integers N and L. The next N lines contains a single sting each of length L.

Constraints:-
1 <= N <= 10000
1 <= L <= 20

Note:- String will contain only lowercase english letters.
Output
Print the lexicographically smallest string after concatenating all the strings in some order.
Example
Sample Input:-
3 6
newton
school
isbest

Sample Output:-
isbestnewtonschool

Sample Input:-
4 1
b
c
a
d

Sample Output:-
abcd
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        for(int i = 0; i<n; i++){
            strings[i] = sc.next();
        }
        Arrays.sort(strings);
        StringBuilder result = new StringBuilder();
        for(String s : strings){
            result.append(s);
        }
        System.out.println(result);
    }
}