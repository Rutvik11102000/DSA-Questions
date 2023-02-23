/*
 * Choose points
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given N points on a horizontal axis. Find the number of ways you can choose 3 points such that maximum distance between those points is not greater than d.
Input
The first line contains two integers: N and d. The next line contains N space-separated integers x1, x2, ..., xN, — the x-coordinates of the points that Petya has got.

Constraints:
1 ≤ N ≤ 1e5
1 ≤ d ≤ 1e9
1 ≤ |x[i]| ≤ 1e9

It is guaranteed that the coordinates of the points in the input strictly increase.
Output
Print the number of ways to choose 3 points.
Example
Sample Input:
4 3
1 2 3 4

Sample Output:
4

Explanation:
1 2 3
1 2 4
2 3 4
1 3 4
are the required triplets

Sample Input:
4 2
-3 -2 -1 0

Sample Output:
2
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws Exception {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] line1a = line1.split(" ");
        long n = Long.parseLong(line1a[0]);
        long d = Long.parseLong(line1a[1]);
        long[] valueA = new long[(int) n];
        String line2 = br.readLine();
        String[] line2a = line2.split(" ");
        for (int i = 0; i < n; i++) {
            valueA[i] = Long.parseLong(line2a[i]);
        }
        Arrays.sort(valueA);
        System.out.println(choosePoint(valueA, n, d));
    }

    static long choosePoint(long[] a, long n, long d) {
        long ways = 0;
        if (d == n) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            long high = upperLimit(a, 0, n, a[i] + d);
            long noe = high - (i + 1);
            if (noe >= 2) {
                ways += (noe * (noe - 1) / 2);
            }
        }
        return ways;
    }

    static long upperLimit(long[] a, long l, long h, long d) {
        while (l < h) {
            long mid = (long) l + (h - l) / 2;
            if (a[(int) mid] > d)
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}