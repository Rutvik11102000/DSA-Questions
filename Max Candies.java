/*
 * Max Candies
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2*N matrix in which each cell contains some candies in it. You are at the top left corner of the matrix and want to reach the bottom right corner of the matrix i. e from (1, 1) to (2, N). You can only move right or down. You have to find the maximum number of candies you can collect in your journey.
Input
The first line of input contains a single integer N. The second line of input contains N spaces separated integers. The last line of input contains N space-separated integers.

Constraints:-
2 <= N <= 10000
1 <= Matrix[i][j] <= 100000
Output
Print the maximum amount of candies you can have at the end of your journey.
Example
Sample Input 1:-
5
1 3 5 6 2
2 4 8 4 2

Sample Output 1:-
23

Sample Input 2:-
4
1 1 1 1
1 1 1 1

Sample Output 2:-
5

 */



 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] Matrix = new int[3][N+1]; // add extra row and column to simplify dp calculation
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= N; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[3][N+1];
        dp[1][1] = Matrix[1][1];
        for (int j = 2; j <= N; j++) {
            dp[1][j] = dp[1][j-1] + Matrix[1][j];
        }
        for (int i = 2; i <= 2; i++) {
            dp[i][1] = dp[i-1][1] + Matrix[i][1];
            for (int j = 2; j <= N; j++) {
                dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[2][N]);
    }
}