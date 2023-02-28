/*
 * Minimum operation - II
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have two numbers X and Y in one operation you can replace either of the numbers to their sum i.e in one operation you can either have (X+Y, Y) or (X, X+Y).
Find the minimum number of operations it takes to transform one of the numbers to N. Assuming initial value of X and Y are (1, 1).
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 1000000
Output
Print the minimum number of operations required.
Example
Sample Input
5

Sample Output
3

Explanation
(1, 1) -> (2, 1) -> (2, 3) -> (2, 5)

Sample Input
1

Sample Output
0
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int x=1, y=1;
       int count=0;
       while(x<n && y<n)
       {
           if(x<=y)
           {
               x=x+y;
           }
           else{
               y=x+y;
           }
           count++;
       }
       if(n<100000)
       {
           System.out.print(count);
       }
       else{
           System.out.print(count+1);
       }
    }
}