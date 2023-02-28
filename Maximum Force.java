/*
 * Maximum Force
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. The Force of an element is the square of its value.

Note:
Elements are not needed to be continuous.
Input
The first line of the input contains two integers denoting n and k.
The next line contains n integers denoting elements of the array.

Constraints:
1 < = k < = n < = 1000
-10^7 <= A[i] <= 10^7
Output
Output the maximum force.
Example
Sample Input 1:
4 4
1 2 3 4

Sample Output 1:
30

Sample Input 2:
2 1
1 10

Sample Output 2:
100

Explanation:
Force = 1*1 + 2*2 + 3*3 + 4*4 = 30
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                arr[i] = arr[i]*(-1);
            }
        }
        Arrays.sort(arr);
        for(int i=0, j=n-1; i<j; i++, j--){
            long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        long ans = 0;
        for(int i=0; i<k; i++) {
            ans = ans + arr[i]*arr[i];
        }
        System.out.print(ans);
    }
}