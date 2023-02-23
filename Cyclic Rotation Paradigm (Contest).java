/*
 * Cyclic Rotation Paradigm (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. In one move, you can choose any subarray from this array and rotate it cyclically in any direction, any number of times. After exactly one such move, find the maximum value of AN - A1.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print the maximum value of AN - A1 after performing the above operation exactly once.
Example
Sample Input:
4
2 1 8 1

Sample Output:
7

 */




 import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = arr[n - 1] - arr[0];
    for (int i = 0; i < n - 1; i++) {
      ans = Math.max(ans, arr[i] - arr[i + 1]);
    }
    for (int i = 1; i < n; i++) {
      ans = Math.max(ans, arr[i] - arr[0]);

    }
    for (int i = 0; i < n - 1; i++) {
      ans = Math.max(ans, arr[n - 1] - arr[i]);
    }
    System.out.println(ans);
  }
}