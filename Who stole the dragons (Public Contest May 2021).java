/*
 * 
 * Who stole the dragons? (Public Contest: May 2021)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Pree says he stole Daenerys' dragons, and would return them to Daenerys only if she can pair the dragons in a peculiar way.
There are N (N is even) dragons, the strength of ith dragon is Ai. She needs to create N/2 pairs of the dragons. The strength of the dragon pair is the sum of the strengths of dragons in the pair. She needs to pair them in such a way that the difference between the strength of dragon pair with maximum strength and the strength of the dragon pair with minimum strength is minimised.

Now, you need to find the minimum difference in strengths if she has paired them correctly.
Input
The first line of the input contains an integer N, the number of dragons.
The second line of the input contains N integers, the strengths of the dragons.


Constraints
1 <= N <= 200000 (so many dragons, huh)
1 <= Ai <= 109 for all values of i
N is divisible by 2
Output
Output a single integer, the answer to the problem.
Example
Sample Input
4
1 2 1 2

Sample Output
0

Explanation
Daenerys pairs 1st and the 2nd dragons together; the 3rd and the 4th dragon together

Sample Input
6
2 3 2 4 5 1

Sample Output
1
 */


 import java.io.*; // for handling input/output
 import java.util.*; // contains Collections framework
 
 // don't change the name of this class
 // you can add inner classes if needed
 class Main {
     public static void main (String[] args) {
                       // Your code here
                       Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         Arrays.sort(arr);
         int l=0,r=n-1;
         long maxDiff= arr[l]+arr[r];
         long minDiff=maxDiff;
         while(l<r){
             maxDiff=Math.max(maxDiff,(arr[l]+arr[r]));
             minDiff=Math.min(minDiff,(arr[l]+arr[r]));
             l++;r--;
         }
         System.out.println(maxDiff-minDiff);
     }
 }
