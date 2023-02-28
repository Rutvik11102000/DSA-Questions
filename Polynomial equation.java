/*
 * Polynomial equation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a function f(x) = ax2 + bx + c and an integer K. Find the minimum non - negative integer value of t such that f(t) >= K.
Input
First line contains four positive integers a, b, c, K.

Constraints
1 <= a, b, c <=100
0 <= K <= 10^16
Output
Print the value of t.
Example
Sample Input 1:
1 1 1 1

Output
0

Explanation:
f(0) = (0 + 0 + 1) >= 1

Sample Input 2:
1 1 1 2

Output
1

Explanation:
f(0) = 1 < 2
f(1) = 3 >=2
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
            Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    long K = sc.nextLong();

    sc.close();

    long t = 0;
    long f = a * t * t + b * t + c;

    while (f < K) {
      t++;
      f = a * t * t + b * t + c;
    }

    System.out.println(t);
  }
}