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