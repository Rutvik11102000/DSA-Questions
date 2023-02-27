import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws Exception {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(line[i]);
        }
        int i = 0, j = i + 1;
        long prod = a[i] * a[j];
        while (j < n - 1) {
            i++;
            j++;
            prod = Math.max(prod, (a[i] * a[j]));
        }
        System.out.println(prod);
    }
}