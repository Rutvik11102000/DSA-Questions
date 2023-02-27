Absolute value discrepancy
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. For all pairs (i, j) (1 <= i < j <= N), find the maximum value of abs(Ai - Aj) in the array.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= Ai <= 109
Output
Print the maximum value of abs(Ai - Aj) in the array.
  
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        int maxDiff = max - min;
        System.out.println(maxDiff);
    }
}
