/*
 * Power of Three
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Swapnil is challenged to build a tower of a height greater than or equal to N. To build the tower he is given blocks of heights which are powers of 3. He can only use one type of block only once and is given infinite types of blocks. Help him make a tower of minimum height just greater than or equal to N.
Input
The first line of the input contains one integer T the number of tests. Then T test cases follow.
Each test case contains a single integer N.

Constraints:-
1 ≤ t ≤ 100
0 ≤ N ≤ 1018
Output
For each test case, print the height of the minimum possible tower greater than or equal to N.
Example
Sample Input
5
1
8
4
6
5

Sample Output
1
9
4
9
9

Explanation:
N=1 => use one brick of height 30
N=8 => use one brick of height 32
N=4 => use two bricks of heights 30 and 31
N=6 => use one brick of height 32. We can not use 2 bricks of the same type so can't use two bricks of height 31.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws IOException {
        // Your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            long n = Long.parseLong(br.readLine());
            if(n ==0){
                System.out.println(1); 
                continue;
            }
            System.out.println(powerOf(n));
        }
    }
    public static long powerOf(long n){
        if(n<=0)return 0;

        long p = (long)(Math.log(n)/Math.log(3));

        if(gpSum(p)>=n)
        return power(3,p)+ powerOf(n- power(3,p));
        else 
        return power(3,p+1);
    }
    public static long gpSum(long p){
        return (power(3,p+1)-1)/2;
    }
    public static long power(long base,long p){
        if(p==0)
        return 1;
        else 
        return (base*power(base,p-1));
    }
}