/*
 * Max Candies (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a row of N shops. Each shop sells A[i] candies. Your friend made an array B of (N-1) integers where B[i] = max(A[i], A[i+1]) for i from 1 to (N-1). You are given array B. You want to generate the array A such that the sum of values of the candies in A is maximum. Find the maximum possible sum of candies of array A.
Input
The first line of input contains a single integer N.
The second line of input contains (N-1) integers denoting array B.

Constraints:
2 ≤ N ≤ 105
1 ≤ B[i] ≤ 109
Output
Print the maximum possible sum of the candies in array A.
Example
Sample Input
4
1 3 4

Sample Output
9

Explanation:
Optimal Array A will be [1, 1, 3, 4]
 */




 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] B = new long[N-1];
        for (int i = 0; i < N-1; i++) {
            B[i] = sc.nextLong();
        }
        long[] A = new long[N];
        A[0] = B[0];
        A[N-1] = B[N-2];
        for (int i = 1; i < N-1; i++) {
            A[i] = Math.min(B[i-1], B[i]);
        }
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        System.out.println(sum);
    }
}