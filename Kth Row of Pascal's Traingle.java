import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static final int mod = 1000000007;

    public static int add(int a, int b) {
        int res = a + b;
        if (res >= mod) {
            res -= mod;
        }
        return res;
    }

    public static int sub(int a, int b) {
        int res = a - b;
        if (res < 0) {
            res += mod;
        }
        return res;
    }

    public static int mul(int a, int b) {
        return (int) ((long) a * b % mod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> row = new ArrayList<>(k + 1);
        row.add(1);
        for (int i = 1; i <= k; i++) {
            int n = row.size();
            for (int j = n - 2; j >= 0; j--) {
                row.set(j + 1, add(row.get(j), row.get(j + 1)));
            }
            row.add(1);
        }
        for (int i = 0; i <= k; i++) {
            System.out.print(row.get(i) + " ");
        }
    }

}
