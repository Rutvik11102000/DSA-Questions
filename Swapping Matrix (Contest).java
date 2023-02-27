/*
 * Swapping Matrix (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a 7 * 7 matrix of 48 zeroes and a single 1. In one move, you can swap any two adjacent rows or columns. Find the minimum number of moves required to bring the single 1 to the middle of the matrix.
Input
The input consists of 7 lines where each line contains 7 space-separated integers.

Constraints:
48 zeroes and a single one is present in the matrix.
Output
Print the minimum number of moves required to bring the single 1 to the middle of the matrix.
Example
Sample Input:
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 1 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0

Sample Output:
2
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int minMoves(int[][] matrix) {
        int x = 0, y = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matrix[i][j] == 1) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        return Math.abs(3 - x) + Math.abs(3 - y);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(minMoves(matrix));
    }
}