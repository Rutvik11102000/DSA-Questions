import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] chopsticks = new int[n];
        for (int i = 0; i < n; i++) {
            chopsticks[i] = sc.nextInt();
        }
        Arrays.sort(chopsticks);
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n && chopsticks[j] - chopsticks[i] <= d; j++) {
                count++;
                i = j;
                break;
            }
        }
        System.out.println(count);
    }
}