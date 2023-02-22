/*
 * Print Squared Sorted Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an sorted array Arr[] of size N, containing both negative and positive integers, you need to print the squared sorted output.

Note Try using two pointer approach
Input
The first line of input contains T, denoting the number of test cases. Each testcase contains 2 lines. The first line contains the N size of the array. The second line contains elements of an array separated by space.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10000
-10000 ≤ A[i] ≤ 10000

The Sum of N over all test cases does not exceed 10^6
Output
For each test case you need to print the sorted squared output in new line
Example
Input:
1
5
-7 -2 3 4 6

Output:
4 9 16 36 49
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int i;
    int T = sc.nextInt();
    while(T-- > 0)
    {
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[N];
        for(i=0;i<N;i++)
        {
            temp[i] = (arr[i] *arr[i]);
        }
        Arrays.sort(temp);
        for(i=0;i<N;i++)
        {
            System.out.print(temp[i]+" ");
        }
         System.out.println();
        
    }
   
    }
}