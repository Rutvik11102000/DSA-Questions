/*
 * Get the Shadow
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array A[] of size N of positive integers. One number 'a' from set {1, 2, …N} is missing and one number 'b' occurs twice in an array. The task is to find the repeating and the smallest positive missing number.
Input
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A(1), A(2), ..., A(N) denoting the elements of the array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
1 ≤ A[i] ≤ N
Output
For each test case, in a new line, print b, which is the repeating number, followed by a, which is the smallest positive missing number, in a single line.
Example
Input:
2
2
2 2
3
1 3 3

Output:
2 1
3 2

Explanation:
Testcase 1: Repeating number is 2 and the smallest positive missing number is 1.
Testcase 2: Repeating number is 3 and the smallest positive missing number is 2.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            int missing = 0;
            int repeating = 0;
            for (int i = 0; i < n; i++) {
                if (a[Math.abs(a[i]) - 1] > 0) {
                    a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
                } else {
                    repeating = Math.abs(a[i]);
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    missing = i + 1;
                    break;
                }
            }
            System.out.println(repeating + " " + missing);
        }
    }
}