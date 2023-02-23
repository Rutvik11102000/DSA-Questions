/*
Zero Padding(Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Padding is a process of adding layers of zeros to the input image. If we want to have p layers of padding then we have to add p layers of zeroes on borders.

Given two integers N and p. How many zeroes are needed to be added to N X N image to give p layers of zero padding?
Input
First line contains N and p.

Constraints
1 ≤ N, p ≤ 108
Output
Output a single integer denoting the required number of zeroes.
Example
Input:
3 1

Output:
16

Explanation :
0 0 0 0 0
0 1 2 3 0
0 4 5 6 0
0 7 8 9 0
0 0 0 0 0
*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        int p=sc.nextInt();
        while(p-->0){
            ans+=4*(1+n);
            n=n+2;
        }
        System.out.println(ans);
    }
}


