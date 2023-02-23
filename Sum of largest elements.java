/*
 * Sum of largest elements
easy
asked in interviews by 2 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, Find the sum of the Four largest numbers of the array and print it.
Input
The first line contains n.
The next line contains n space-separated integers.

Constraints
4 ≤ n ≤ 105
1 ≤ arr[i] ≤ 109
Output
A single integer denoting the sum.
Example
Input:
6
3 1 6 9 4 6

Output:
25

Explanation :
6 + 9 + 4 + 6 = 25
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    long sum=0;
    for(int i=n-1;i>n-5;i--){
        sum +=arr[i];
    }
    System.out.println(sum);
    }
}