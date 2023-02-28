/*
 * Number of unique ways
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Find number of ways an integer N can be represented as a sum of unique natural numbers.
Input
First line contain an integer T denoting number of test cases. Each test case contains a single integer N.

Constraint:-
1 <= T <= 100
0 <= N <= 120
Output
Print a single integer containing number of ways.
Example
Sample input
4
6
1
4
2

Sample output:-
4
1
2
1

Explanation:-
TestCase1:-
6 can be represented as (1, 2, 3), (1, 5), (2, 4), (6)

 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int count=0;
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-- > 0){
           int n=sc.nextInt();
           System.out.println(uniqueWays(n,1));
           count=0;
       }
    }
    static int j;
    public static int uniqueWays(int n,int j){
        if(n==0)
        return count++;
        else{
            for(int i=j;i<=n;i++){
                n=n-i;
                uniqueWays(n,i+1);
                n=n+i;
            }
        }
        return count;
    }
}