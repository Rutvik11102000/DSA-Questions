/*
 * Difference Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, find the maximum value of Ai - Aj over all i, j such that 1 <= i, j <= N.
Input
First line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print the maximum value of Ai - Aj over all i, j such that 1 <= i, j <= N.
Example
Sample Input:
5
6 7 4 5 2

Sample Output:
5

Explaination:
We take i = 2, j = 5. A2 - A5 = 7 - 2 = 5.
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
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(max-min);
    }
}