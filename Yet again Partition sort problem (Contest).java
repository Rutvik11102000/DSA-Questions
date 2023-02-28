/*
 * Yet again Partition sort problem (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Now, you choose an integer X (1 <= X <= N - 1) and take the first X elements of the array and sort them non- decreasingly. SImilarly, you take the remaining N - X elements from the right side of the array and sort them non- decreasingly. Now, find out if for any X (1 <= X <= N - 1), it is possible that the whole array will not be sorted in a non- decreasing fashion.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if for any X (1 <= X <= N - 1), it is possible that the whole array will not be sorted in a non- decreasing fashion., else print "NO", without the quotes.
Example
Sample Input:
4
3 1 2 1

Sample Output:
YES
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<n-1;i++)
       {
           if(arr[i]>arr[i+1])
           {
               System.out.println("YES");
               return;
           }
       }
       System.out.println("NO");
    }
}