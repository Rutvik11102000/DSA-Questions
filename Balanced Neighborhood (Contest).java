/*
 * Balanced Neighborhood (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2-D array of binary integers of size NXM. The cell at ith row and jth column is denoted by (i, j).

The array is called Balanced if every cell of the array having 4 elements has a balanced neighborhood. A neighborhood is balanced if 4 neighbors can be divided into 2 groups with equal size and equal sum.

A cell at (i, j) has 4 neighbors (i-1, j), (i+1, j), (i, j-1), (i, j+1).
Input
The first line contains N and M.
Next N lines contain M integers each.

Constraints
1 ≤ N, M ≤ 1000
0 ≤ arr[i][j] ≤ 1
Output
Print "YES" if the given array is balanced, otherwise print "NO".
Example
Input:
3 4
0 1 0 0
1 1 0 1
0 0 1 1

Output:
NO

Explanation:
neighbors of (1, 1) => {1, 1, 0, 0} => 1+0 = 0+1 => balanced neighborhood
neighbors of (1, 2) => {0, 1, 1, 1} => no way to divide into two groups with equal sum and equal size => unbalanced

No other cell has 4 neighbors.
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if ((a[i - 1][j] + a[i + 1][j] + a[i][j - 1] + a[i][j + 1]) % 2 != 0) {
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.print("YES");
    }
}