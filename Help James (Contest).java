import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            int hello = arr[k - 1];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < hello) {
                    count++;
                }
            }
            System.out.println(count + 1);
        }
        sc.close();
    }
}