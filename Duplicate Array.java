/*
 * Duplicate Array
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a Program to duplicate an array N number of times.
Input
The first line of the input contains two space separated integers N and M - The size of an array and Number of times to be repeated.
The second line contains N space separated integers A1, A2,. , An.

Constraints
1 ≤ N,M ≤ 100
1 ≤ A[i] ≤ 1000
Output
Print the required output.
Example
Sample Input
3 2
1 2 3

Sample Output
1 2 3 1 2 3

 */





 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int j=0;
    int i=0;
    while(j<m && i<n*m){
        System.out.print(arr[i%n]+" ");
        i++;
        j=i/n;
    }
    }
}