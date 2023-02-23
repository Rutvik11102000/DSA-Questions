/*
 * Find element in 2D array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2D matrix of size [M, N], Q number of queries. In each query, you will be given a number X to check whether it is present in the matrix or not.
Input
The first line contains three integers M(number of rows), N(Number of columns), and Q(number of queries)
Next M lines contain N integers which are the elements of the matrix.
Next, Q lines will contain a single integer X.

Constraints:-
1<=M,N<=1000
1<=Q<=10000
1<=X, Arr[i]<=1000000000
Output
For each query, in a new line print "Yes" if the element is present in matrix or print "No" if the element is absent.
Example
Input:-
3 3 2
1 2 3
5 6 7
8 9 10
7
11

Output:-
Yes
No

Input:-
3 4 4
4 8 11 14
15 54 45 47
1 2 3 4
5
15
45
26

Output:-
No
Yes
Yes
No
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int q = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                set.add(num);
            }
        }

        while (q-- > 0) {
            int x = sc.nextInt();
            if (set.contains(x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}