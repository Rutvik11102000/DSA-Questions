/*
 * Special digit sum (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The special digit sum (SDS) is defined as the sum of maximum digit in each number of the array.
For example, SDS of { 23, 5, 614 } is max(2, 3) + 5 + max(6, 1, 4) = 3 + 5 + 6 = 14.

Given an array of N integers. Print the special digit sum (SDS) of the array.
Input
First line contains N.
Next line contains N space separated integers.

Constraints
1 ≤ N ≤ 105
1 ≤ a[i] ≤ 1018
Output
Print a single integer denoting the SDS of the given array.
Example
Input:
4
231 671 934 73

Output:
26

Explanation:
max(2, 3, 1) = 3
max(6, 7, 1) = 7
max(9, 3, 4) = 9
max(7, 3) = 7
SDS = 3 + 7 + 9 + 7 = 26
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            int max = 0;
            while(num>0)
            {
                int digit = num%10;
                if(digit > max)
                {
                    max = digit;
                }
                num /= 10;
            }
            sum += max;
        }
        System.out.println(sum);
    }
}