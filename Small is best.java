/*
 * Small is best
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A containing a permutation of N numbers. Find the number of indices i such that A[i] <= A[j] satisfies for all the values of j satisfying 1 <= j <= i .
Input
The first line of the input contains an input N, the size of the permutation.
The second line of the input contains N singly spaced integers, the elements of the permutation P.

Constraints
1 <= N <= 200000
1 <= P[i] <= N
P is a permutation of the first N natural numbers.
Output
Output a single integer, the answer to the problem.
Example
Sample Input
6
3 2 5 6 1 4

Sample Output
3

Sample Input
3
1 2 3

Sample Output
1

Explanation 1:
The indices i=1, i=2, and i=5 satisfy the condition.
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] > a[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result++;
            }
            stack.push(i);
        }
        System.out.println(result);
    }
}