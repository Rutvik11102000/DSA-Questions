/*
 * Minimum adjacent difference in a circular array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N integers arranged in a circular fashion. Your task is to find the minimum absolute difference between adjacent elements.
Input
The input line contains T, denoting the number of testcases. Each testcase contains two lines. The first line contains N(size of array). The second line contains N elements of array separated by space.

Constraint:
1 <= T <= 100
2 <= N <= 10^5
-10^6 <= Arr[i] <= 10^6
Sum of N over all testcases is less than equal to 10^6
Output
For each testcase in new line print the minimum absolute difference.
Example
Input:
3
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1

Output:
4
1
0

Explanation:
Testcase 1: The absolute difference between adjacent elements in the given array are as such: 16 17 18 19 21 23 4(first and last). Among the calculated absolute difference the minimum is 4.
Testcase 2: The absolute difference between adjacent elements in the given array are as such: 13 1 11 1 1 9 3 11(first and last). Among the calculated absolute difference, the minimum is 1.
Testcase 3: The absolute difference between adjacent elements in the given array are as such: 41 54 21 1 1 9 3 0(first and last). Among the calculated absolute difference, the minimum is 0.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            min(arr,n);
        }

    }
        static void min(int arr[],int n){
            if(n<2)
            return;
                int res = Math.abs(arr[1]- arr[0]);
                for(int i =2;i<n;i++)
                    res = Math.min(res,Math.abs(arr[i]-arr[i-1]));
                    res = Math.min(res,Math.abs(arr[n-1]-arr[0]));
                    System.out.println(res);
                
        }
       
    
}