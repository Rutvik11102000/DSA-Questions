/*
 * Max Widow Sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of integers arr of size n, a window of size k. Your task is to find the sum of the maximum element from each window.
Input
The first line contains the input of n, k ie the size of the array, and the size of the window.
The next line contains the input of the array.

Constraints
1 <= k < n <= 105
1 <= arr[i] <= 105
Output
Print the single line containing the maximum sum.
Example
Sample Input 1:
5 3
1 2 3 4 5

Sample Output 1:
12

Sample Input 2:
6 2
2 3 1 7 8 3

Sample Output 2:
29
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long maxWindowSum(long arr[],int k) {
                      // Your code here
					  long cursum = 0;
					  int n = arr.length;
					  for(int i = 0;i<=n-k;i++){
						  long mx= arr[i];
						  for(int j =1;j<k;j++){
							  mx = Math.max(mx,arr[i+j]);
						  }
						  cursum+=mx;
					  }
					  return cursum;
    }
	public static void main (String[] args) {
     Scanner sc = new Scanner (System.in);
	 int n = sc.nextInt();
	 int k = sc.nextInt();
	 long arr[] = new long[n];
	 for(int i = 0;i<n;i++){
		 arr[i] = sc.nextInt();
	 }
	 System.out.print(maxWindowSum(arr,k));
}
}