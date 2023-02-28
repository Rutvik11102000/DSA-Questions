/*
 * Squiggly brackets
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Morgan Stark asks Peter for help in her HW. She is given an integer n representing the number of pairs of squiggly brackets. Her task is to find the number of all combinations of well- formed(balanced) squiggly brackets.
Input
The input contains only a single integer denoting the value of n.

Constraints:-
0 ≤ n ≤ 7
Output
Print the number of squiggly brackets.
Example
Sample Input:-
1

Sample Output:-
1

Explanation:-
{}

Sample Input:-
2

Sample Output:-
2

Explanation:-
{}{}
{{}}
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int count = 0;
   public static void balance(int open, int close,  int n){
       if(close==n){
           count++;
           return;
       }
       if(open>close){
           balance(open, close+1, n);
       }
       if(open<n){
           balance(open+1, close, n);
       }
   }
   public static void main (String[] args) {
   Scanner sc= new Scanner (System.in);
   int n=sc.nextInt();
   balance( 0, 0, n);
   System.out.println(count);
   }
}