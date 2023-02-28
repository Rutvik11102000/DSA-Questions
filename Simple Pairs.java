/*
 * Simple Pairs
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements, N is an even positive number. You have to make N/2 pairs among them such that each element is in exactly one pair. Score of a pair is the absolute difference between there values. Find the maximum sum of score of N/2 pairs.
Input
First Line of input contains N.
Second line of input contains N space seperated integers, denoting Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
N will be even
Output
Print a single integer which is the maximum sum of score of N/2 pairs.
Example
Sample Input 1
2
1 2

Sample Output 1
1

Sample Input 2
4
1 4 2 4

Sample Output 2
5

Explanation: (1, 4) (2, 4) are the optimal pairs
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         Arrays.sort(arr);
         long sum1 =0;
         long sum2 =0;
    
        for(int i=0; i<n; i++){
            if(i<n/2){
                sum1 +=arr[i];
            }else{
                sum2 +=arr[i];
            }
 
        }

        
        System.out.println(sum2-sum1);
    }
}