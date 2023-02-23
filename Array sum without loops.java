/*
 * Array sum without loops
easy
hint
Hint

asked in interviews by 2 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of n integers. Print the sum of all numbers in the array without using any loop.
Input
First line contains a single integer denoting n.
Next line contains n space separated integer.

Constraints
1 <= n <= 105
1 <= arr[i] <= 109
Output
A single integer denoting the sum.
Example
Input:
4
3 9 2 7

Output:
21
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
    long sum=0;
    int j=0;
    while(true){
        sum +=arr[j++];
        if(j<n){
            continue;
        }else{
            break;
        }
    }
    System.out.println(sum);
    }
}