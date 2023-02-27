// The EndGame : Maximum Sliding Window 

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        ArrayDeque<Integer> indexQueue = new ArrayDeque<>();

        for(int i=0; i<k; i++){
            while(!indexQueue.isEmpty() && a[indexQueue.peekLast()] <= a[i]){
                indexQueue.removeLast();
            }
            indexQueue.addLast(i);
        }

        //First window Max
        System.out.print(a[indexQueue.peekFirst()] + " ");

        for(int i=k; i<n; i++){
            while(!indexQueue.isEmpty() && a[indexQueue.peekLast()] <= a[i]){
                indexQueue.removeLast();
            }
            indexQueue.addLast(i);

            while(!indexQueue.isEmpty() && indexQueue.peekFirst() <= i-k){
                indexQueue.removeFirst();
            }

            System.out.print(a[indexQueue.peekFirst()] + " ");
        }

    }
}
