/*
 * The EndGame : Maximum Sliding Window
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. You have to print the maximum in every K-sized subarray from the left to the right in the array A.
More formally, you have to print N - K + 1 integers X1, X2, ..., XN-K+1 such that Xi (1 <= i <= N - K + 1) is the maximum element in the subarray Ai, Ai+1, ..., Ai+K-1.
Input
1. The first line contains an integer N, denoting the size of the array.
2. The second line has N space-separated integers of the array A.
3. The third line contains integer K, denoting the size of the sliding window

Constraints :
1 ≤ N ≤ 105
-104 ≤ A[i] ≤ 104
1 ≤ K ≤ N
Output
Print the max of K numbers for each position of sliding window
Example
Sample Input:-
8
1 3 -1 -3 5 3 6 7
3

Sample Output:-
3 3 5 5 6 7

Explanation:-
Window position Max
- - - -
[1 3 -1] -3 5 3 6 7 3
1 [3 -1 -3] 5 3 6 7 3
1 3 [-1 -3 5] 3 6 7 5
1 3 -1 [-3 5 3] 6 7 5
1 3 -1 -3 [5 3 6] 7 6
1 3 -1 -3 5 [3 6 7] 7

Sample Input:-
1
1
1

Sample Output:-
1
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        printMaxInSubarray(a, k);
    }

    public static void printMaxInSubarray(int[] a, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = a.length;
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (int i = k; i < n; i++) {
            System.out.print(a[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(a[dq.peek()]);
    }
}