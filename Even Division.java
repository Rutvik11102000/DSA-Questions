import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            while (true) {
                boolean allEven = true;
                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 != 0) {
                        allEven = false;
                        break;
                    }
                }
                if (allEven) {
                    count++;
                    for (int i = 0; i < n; i++) {
                        arr[i] = arr[i] / 2;
                    }
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }