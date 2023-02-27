/*
Print Square of Each Number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
For all non- negative integers i
Input
The first line contains the integer n.

Constraints
1<=n<=20
Output
Print n lines, one corresponding to each i.
Example
Sample Input:
3
Sample Output:
0
1
4

Explanation:
Prints the square of each number less than n on a separate line.



*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        do{
            System.out.println(i*i);
            i++;
        }while(i<n);
    }
}