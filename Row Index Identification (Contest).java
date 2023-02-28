/*
 * Row Index Identification (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a grid having N*M elements. Find the index of the row (1- indexed) which has the maximum sum of elements.
Input
The first line of the input contains two integers N and M.
The next N lines each contain M space separated integers.

Constraints:
1 <= N, M <= 103
1 <= Ai, j <= 109
Output
Print the index of the row (1- indexed) which has the maximum sum of elements.
Example
Sample Input:
3 4
3 4 2
5 1 7
2 8 1
2 3 3

Sample Output:
2

Explaination:
Row number 2 has sum = 5 + 1 + 7 = 13 which is the maximum among all rows.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxRow = 0;
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += sc.nextInt();
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i + 1;
            }
        }
        System.out.println(maxRow);
    }
}