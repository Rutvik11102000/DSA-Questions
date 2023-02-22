/*
Max subarray sum (size K)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers A and a number K, find maximum sum of a subarray of size K.
Input
The first line of input contains two integers N and K, denoting the number of elements in the array and the subarray size respectively.
The next line contains N integers denoting the elements of the array respectively.

1 <= K <= N <= 200000
-200000 <= A[i] <= 200000
Output
Print a single integer denoting the maximum sum of subarray of size K.
Example
Sample Input:
4 2
-1 5 2 -3

Sample Output:
7

Explanation:
Three subarrays of size 2, their sum are 4, 7, -1
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
     int i;
    int max = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N];
    for(i=0;i<N;i++)
    {
        arr[i] = sc.nextInt();
    }
    for(i=0;i < (N-K+1);i++)
    {
        int cur = 0;
        for(int j=0;j<K;j++)
        {
            cur = cur + arr[i+j];
        }
        if(cur > max)
        {
            max = cur;
        }
    }
    System.out.print(max);
    }
}