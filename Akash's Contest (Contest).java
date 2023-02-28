/*
 * Akash's Contest (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
This morning the problem setters decided to add one more easy problem to the problem set of Newton School. Akash has printed the statement in one copy, and now they want to make n more copies before starting the contest. They have 2 copiers in the office, one which copies a sheet in x seconds and the other in y seconds (Using both copiers at the same time is allowed). You can copy not only from the original but from the copied copies. Help him to find out what is the minimum time they need to make n copies of the statement.
Input
The first line of the input contains three space- separated integers n, x, and y.

Constraints
1 ≤ n ≤ 2.108
1 ≤ x, y ≤ 10
Output
Print one integer, the minimum time in seconds required to get n copies.
Example
Sample Input
4 1 1
Sample Output
3

Sample Input
5 1 2
Sample Output
4
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(solution(n, x, y));
    }

    public static int solution(int n, int x, int y) {
        if (n == 1)
            return Math.min(x, y);

        int ans = 0;
        int left = 0;
        int right = Math.max(x, y) * n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isGood(mid, n, x, y)) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans + Math.min(x, y);
    }

    public static boolean isGood(int mid, int n, int x, int y) {
        return (mid / x) + (mid / y) >= n - 1;
    }
}