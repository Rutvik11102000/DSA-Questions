/*
 * Largest Bitonic Subarray
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of positive integers as input. Print the length of the largest subsequence such subsequence in which the values are arranged first in strictly ascending order and then in strictly descending order.
Such a subsequence is known as bitonic sub-array. A purely increasing or purely decreasing subsequence will also be considered as a bitonic sequence with the other part empty.

Note: that the elements in bitonic sub-array need not be consecutive in the given array but the order should remain same.
Input
First line contains N, size of array. Second line contains elements of array separated by space.

Constraints:
1 < = N < = 10^3
1 < = ai < = 10^6
Output
Length of Largest Bitonic Sub-Array
Example
Input:
6
15 20 20 6 4 2

Output:
5

Explanation:
Testcase 1:
Here, longest Bitonic sub-array is {15, 20, 6, 4, 2} which has length = 5.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(lbs(arr, n));
    }
        static int lbs(int arr[] , int n){
            int i, j;
            int [] lis = new int [n];
            for(i=0; i<n; i++){
                lis[i] =1;
            }
            for(i=1; i<n; i++){
                for(j=0; j<i; j++){
                    if(arr[i] > arr[j] && lis[i] < lis[j] +1){
                        lis[i] = lis[j] +1;
                    }
                }
            }
            int lds[] = new int[n];
            for(i=0; i<n;i++){
                lds[i] =1;
            }
            for(i= n-2; i>=0; i--){
                for(j=n-1; j>i; j--){
                    if(arr[i]> arr[j] && lds[i] < lds[j] +1){
                        lds[i] = lds[j] +1;
                    }
                }
            }
            int max = lis[0] + lds[0] -1;
            for(i= 1; i< n; i++){
                if(lis[i] + lds[i] -1 > max){
                    max=lis[i] + lds[i]-1;
                }
            }
            return max;
        }
    }