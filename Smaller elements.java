/*
 * 
 * Smaller elements
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sorted array of N integers a[], and Q queries. For each query, you will be given a positive integer K and your task is to print the number of elements in array a[] that are smaller than or equal to K.
Input
In case of Java only
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function smallerElements() that takes the array a[], integer N and integer k as arguments.

Custom Input
The first line of input contains a single integer N.
The second line of input contains N space- separated integers depicting the values of the array.
The third line of input contains a single integer Q, the number of queries.
Each of the next Q lines of input contain a single integer, the value of K.

Constraints:-
1 <= N <= 105
1 <= K, Arr[i] <= 1012
1 <= Q <= 104
Output
Return the count of elements smaller than or equal to K.
Example
Sample Input:-
5
2 5 6 11 15
5
2
4
8
1
16

Sample Output:-
1
1
3
0
5
 */



 static int smallerElements(int a[], int n, int k){
    //Enter your code here
    int count = 0,s =0, e=n-1;
    while(s<=e){
            int m = s+(e-s)/2;
            if(a[m]<=k){
                    count = m+1;
                    s = m+1;
            }
            else{
                    e= m-1;
            }
    }
    return count;
}