/*
 * Increment- Decrement Philosophy (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N (1 - indexed). In one move, you can choose any two indices i, j such that Ai > Aj. Now, you can decrease Ai by 1 and increase Aj by 1. Find out the maximum possible value of A1 after any number of moves.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print the maximum possible value of A1 after any number of moves.
Example
Sample Input:
3
1 2 3

Sample Output:
3
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int max(int arr[], int n){
int x = arr[0];
Arrays.sort(arr);
for(int i=0; i<n; i++){
if(arr[i]> x){
x += (arr[i] - x+1)/2;
}
}
return x;
}
public static void main (String[] args) {
// Your code here
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++){
arr[i]= scn.nextInt();
}
System.out.println(max(arr,n));
}
}
