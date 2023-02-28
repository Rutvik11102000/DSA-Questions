/*
 * Spiral rotation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There has been an attack on SHIELD. Nick Fury has given you the responsibility of protecting all the information but during the chaos he forgot to tell you how to login into the classified information. Just then a “secret code” appears on the screen.

Print the information in a 2D integer array of size (N x M) in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
Mind that every element will be printed only once.
Input
The first line of input contains two integers N and M, the next N lines of input contains M space- separated integers each depicting the values of the matrix.

Constraints:-
2 <= N, M <= 500
1 <= Matrix[][] <= 1000000
Output
Print the matrix in spiral form as shown in the example.
Example
Sample Input:-
3 3
1 2 3
4 5 6
7 8 9

Sample Output:-
1 2 3 6 9 8 7 4 5

Sample Input:-
4 5
2 4 6 8 10
12 14 16 18 20
22 24 26 28 30
32 34 36 38 40

Sample Output:-
2 4 6 8 10 20 30 40 38 36 34 32 22 12 14 16 18 28 26 24
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
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}