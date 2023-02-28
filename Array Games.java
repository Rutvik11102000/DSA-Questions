/*
Array Games
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, find the maximum subarray size such that the difference between the maximum and minimum elements of the subarray is <= K.
Input
First line of the input contains two integers N and K.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= K <= 109
1 <= Ai <= 109
Output
Print the maximum subarray size such that the difference between the maximum and minimum elements of the subarray is <= K.
Example
Sample Input:
5 3
3 5 2 7 1

Sample Input:
3

Explanation:
We can take subarray [3, 5, 2]. No subarray of size 4 or larger will satisfy the condition.
*/import java.io.*; // for handling input/output
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