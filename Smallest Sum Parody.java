/*
 * Smallest Sum Parody
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Find the smallest sum of any two numbers (on distinct indices) possible in the array,
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= Ai <= 109
Output
Print the smallest sum of any two numbers (on distinct indices) possible in the array,
Example
Sample Input:
5
5 3 8 7 2

Sample Output:
5
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[0]+arr[1]);
    }
}