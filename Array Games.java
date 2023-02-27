import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long arr[] = new long[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        Queue<Long> q = new LinkedList<>();
        TreeSet<Long> set = new TreeSet<>();
        int size = 0;
        int maxSize = 0;

        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
            q.add(arr[i]);

            if(set.last() - set.first() > k) {
                while(!set.isEmpty() && set.last()-set.first() > k) {
                    long ele = q.poll();
                    set.remove(ele);
                    size = q.size();
                }
            }
            size = q.size();
            maxSize = Math.max(maxSize, size);
        }

        System.out.println(maxSize);
    }
}
/*
 7 1
maxSize = 3;
size = 2;
*/