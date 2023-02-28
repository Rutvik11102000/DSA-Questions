/*
 * Two Sum Maximization
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. For all pairs (i, j) (1 <= i < j <= N), find the maximum value of Ai + Aj in the array.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= Ai <= 109
Output
Print the maximum value of Ai + Aj in the array.
Example
Sample Input:
5
6 4 9 3 7

Sample Output:
16
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]>max1){
               max2=max1;
               max1=arr[i];
           }else if(arr[i]>max2){
               max2=arr[i];
           }
        }
        System.out.print(max1+max2);
    }
}