/*
 * Bubble Sort (descending order)
easy
asked in interviews by 23 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array, sort the array in reverse order by simply swapping its adjacent elements.
Input
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Constraints
1<=N<=1000
-10000<=Arr[i]<=100000
Output
Output sorted array in descending order where each element is space separated.
Example
Sample Input:
6
3 1 2 7 9 87

Sample Output:
87 9 7 3 2 1
 */



 import java.util.*;
import java.lang.*;
import java.io.*;

class Main

{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int t;
		for(int i=1;i<n;i++){
		    if(a[i]>a[i-1]){
		        for(int j=i;j>0;j--){
		            if(a[j]>a[j-1]){
		                t=a[j];
		                a[j]=a[j-1];
		                a[j-1]=t;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++){

		    System.out.print(a[i]+" ");
		}
}	    
}