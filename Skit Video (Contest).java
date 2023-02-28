/*
 * Skit Video (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Ritu recorded a video of her friend Tina's skit. The video is too large to send to her friend. In order to send it to her, she wants to compress it as much as possible. Initially, the video has N frames. The value of the ith frame is Ai. The following type of operation can be performed by Ritu countless times:
Choose an index i(1 ≤ i ≤ N) such that the value of the ithis equal to the value of either of its neighbors and remove the ithframe.
Find the minimum number of frames Ritu can achieve.
Input
The first line will contain T, the number of test cases. Then the test cases follow. The first line of each test case contains a single integer N - the number of frames initially. The second line contains N space-separated integers, A1, A2,...., AN- the values of the frames.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 105
1 ≤ Ai ≤ 106
The Sum of N over all test cases does not exceed 2*105
Output
For each test case, output in a single line the minimum number of frames Ritu can achieve.
Example
Sample Input :
4
1
5
2
1 1
3
1 2 3
4
2 1 2 2

Sample Output :
1
1
3
3
Explanation:
There is only one frame with a value of 5. Since there are no neighbors, Ritu won't remove any frame and the minimum number of frames Ritu can achieve is 1.
There are two frames where both frames have a value of 1. Ritu can remove the first frame as the value of the first frame is equal to that of the second frame. The remaining frames have values [1]. The minimum number of frames Ritu can achieve is 1.
There are 3 frames. All frames have distinct values. Thus, the minimum number of frames Ritu can achieve is 3.
Ritu can remove the fourth frame as the value of the fourth frame is equal to that of the third frame. The remaining frames have values [2, 1, 2]. Thus, the minimum number of frames Ritu can achieve is 3.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i]= sc.nextInt();
            }

            System.out.println(getResult(n,arr));
        }
    }

    private static int getResult(int n,int[] arr) {
        if(n==1) {
            return n;
        }
        int count=0;
        for ( int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) {
                count++;
            }
        }
        return n-count;
    }

}