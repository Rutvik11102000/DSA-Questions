/*
 * Implementing Insertion sort
easy
asked in interviews by 3 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.
Input
First line of the input denotes number of test cases T. First line of the testcase is the size of array N and second line consists of array elements separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^3
1 <= A[i] <= 10^3
Output
For each testcase print the sorted array in a new line.
Example
Input:
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1

Output:
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10

Explanation:
Testcase 1: The array after perfoming insertion sort: 1 3 4 7 9.
Testcase 2: The array after performing insertion sort: 1 2 3 4 5 6 7 8 9 10.
 */





 import java.util.Scanner;
public class Main {
       public static void InsertionSort(int arr[]) {
        // Time Complexity=o(n^2) rutvik
		int n=arr.length;
        for(int i=1;i<n;i++){
		    int b = i-1;
		    int key = arr[i];
		    while(b>=0 && arr[b]>key)  arr[b+1] = arr[b--];
		    arr[b+1] = key;
		}

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();
		for(int p=0;p<t;p++){
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		InsertionSort(arr);
		}
    }
}