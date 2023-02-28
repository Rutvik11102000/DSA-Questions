/*
 * Rahul's Groceries (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rahul went to the grocery shop to get some new ingredients. There are N goods in the store, with the ith item having a freshness value Ai and a cost Bi.
Rahul decided to buy all the items having freshness value greater than or equal to X. Find the total cost of the groceries Rahul buys.
Input
The first line of the input contains a single integer T denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case consists of two space-separated integers N and X, the number of items and the minimum freshness value an item should have.
The second line contains N space-separated integers, the array A, denoting the freshness value of each item.
The third line contains N space-separated integers, the array B, denoting the cost of each item.

Constraints
1 ≤ T ≤ 100
1 ≤ N, X ≤ 100
1 ≤ A[i], B[i] ≤ 100
Output
For each test case, output on a new line, the total cost of the groceries Rahul buys.
Example
Sample Input
2
2 20
15 67
10 90
3 1
1 2 3
1 2 3
Sample Output
90
6
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of items
            int x = sc.nextInt(); // minimum freshness value
            int[] a = new int[n]; // freshness value of each item
            int[] b = new int[n]; // cost of each item

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int totalCost = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] >= x) {
                    totalCost += b[i];
                }
            }

            System.out.println(totalCost);
        }
    }
}