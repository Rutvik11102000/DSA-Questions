/*
 * Odd Sum Array (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. In one move, you can swap Ai and Ai+1 if Ai + Ai+1 is odd. Find out if you can sort this array non- decreasingly after performing any (possibly 0) number of moves.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space separated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if you can sort the array non- decreasingly, else print "NO", without the quotes.
Example
Sample Input:
4
1 6 31 14

Sample Output:
YES
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]= scn.nextLong();
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if((arr[i-1]+arr[i])%2==0){
                    System.out.print("NO");
                    return;
                }
                else{
                    long temp = arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.print("YES");
    }
}