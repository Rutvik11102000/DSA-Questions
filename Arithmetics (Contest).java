/*
 * Arithmetics (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two integers N and M (N > M). You have to find the smallest integer X such that N - M <= X <= N + M and M - X <= X - N
Input
First and the only line of the input contains two integers N and M.

Constraints:
1 <= N < M <= 109
Output
Find and print the smallest integer X which satisifes the above condition. If no such integer exists, print -1.
Example
Sample Input:
8 4

Sample Output:
6

Explaination:
6 is the smallest integer X between N - M (8 - 4 = 4) and N + M (8 + 4 = 12) such that M - X <= X - N.


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

        int m=sc.nextInt();

        int p=n-m;

        int q=n+m;

        int x=-1;

        for(int i=p;i<q;i++){

            if(m-i<=i-n){

                x=i;

                break;

            }

        }

        System.out.print(x);

    }

}