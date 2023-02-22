/*
 * Find it!!
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer K, find a positive integer x such that K = x2 + 3*x. If no such positive integer x exists, print -1.
Input
First and the only line of the input contains an integer K.

Constraints:
1 <= K <= 1018
Output
Print a positive integer x such that the above equation satisfies. If no such integer x exists, print -1.
Example
Sample Input:
28

Sample Output:
4

Explaination:
42 + 3*4 = 28
There is no other positive integer that will give such result.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
             long K;
              Scanner s= new Scanner(System.in);
              K=s.nextLong();
              boolean found = false;
             for(long  x=1; x<=Math.sqrt(K);x++){
                 if(K==x*x+3*x){
                     System.out.println(x);
                     found=true;
                     break;
                 }
             }
             if(!found){
                 System.out.println(-1);
             }       
    }
}