/*
 * Citation-Index Calculation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of citations (each citation is a non-negative integer) of a researcher, write a program to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

Note: If there are several possible values for h, the maximum one is taken as the h-index.
Input
Input contains a single integer denoting the size of array.
The next line contains an array of integers, i.e., an array of citations

Constraints:
1 <= n <= 10^3
1 <= A[i] <= 10^3
Output
Output a single integer denoting the h-index.
Example
Input:
5
3 0 6 1 5

Output:
3

Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had
received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining
two with no more than 3 citations each, her h-index is 3.
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
        int[] citations = new int[n];
        for(int i = 0; i<n; i++){
            citations[i] = sc.nextInt();
        }

        Arrays.sort(citations);
        int h = 0;
        for(int i = 0; i<n; i++){
            if(citations[i] >= n-i){
                h = n-i;
                break;
            }
        }
        System.out.println(h);
    }
}