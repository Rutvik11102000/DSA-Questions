/*
 * Maximum Value of X
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N, and an integer x = 0. In one move, you can choose two indices i and j such that i < j and add the maximum of these integers from the two to x. And finally, delete that bigger number from the array. If both elements are equal you can remove any of the two and add that value to x.
After performing this operation a maximum of K times, find the maximum possible value of x you can get.
Input
First line of the input contains two integers, N and K.
The second line of the input contains N space seperated integers.

Constraints:
1 <= K < N <= 105
1 <= Ai <= 109
Output
Print the maximum possible value of x you can get.
Example
Sample Input:
5 2
5 6 4 2 3

Sample Output:
11

Explanation:
In the first move, we choose i = 1 and j = 3. We get the max value of these as 5, and then we add it to x and remove it from the array. x = 5, A = [6, 4, 2, 3]
In the next and final move, we again choose indices i = 1, j = 3. Updated x = 11, A = [4, 2, 3]
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) 
    {
                      // Your code here
        Scanner rvk = new Scanner(System.in);
        int n = rvk.nextInt();
        int k = rvk.nextInt();
        long[]A = new long[n];
        for(int i = 0 ; i< n; i++)
        {
            A[i] = rvk.nextLong();
        }

        Arrays.sort(A);
        long sum = 0;
        for(int i= n-k; i<n ; i++)
        {
            sum+=A[i];
        }

        System.out.println(sum);
    }
}