/*

Inversion of array
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of positive integers. The task is to find inversion count of array.

Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Asked in Adobe, Amazon, Microsoft.
Input
The first line of each test case is N, the size of the array. The second line of each test case contains N elements.

Constraints:-
1 ≤ N ≤ 10^5
1 ≤ a[i] ≤ 10^5
Output
Print the inversion count of array.
Example
Sample Input:
5
2 4 1 3 5

Sample Output:
3

Explanation:
Testcase 1: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
*/



#include <bits/stdc++.h>
using namespace std;
long long merge(long long arr[],long long temp[],long long left,long long mid,long long right)
    {
     	long long i=left,j=mid,k=left,ctrinv=0;
        while((i<=mid-1)&&(j<=right))
        {
            if(arr[i]<=arr[j])
            {
            	temp[k++]=arr[i++];    
            }
            else
            {
                temp[k++]=arr[j++];
                ctrinv=ctrinv+(mid-i);
            }            
        }
        while(i<=mid-1)
        {
            temp[k++]=arr[i++];    
        }
        while(j<=right)
        {
            temp[k++]=arr[j++];
        }
        for(i=left;i<=right;i++)
        {
            arr[i]=temp[i];
        }
        return ctrinv;
    }
    
long long mergesort(long long arr[],long long temp[],long long left,long long right)
    {
        long long mid=0,ctrinv=0;
        if(left<right)
        {
            mid=(left+right)/2;
            ctrinv+=mergesort(arr,temp,left,mid);
            ctrinv+=mergesort(arr,temp,mid+1,right);
            ctrinv+=merge(arr,temp,left,mid+1,right);
        }
        return ctrinv;
    }
long long int inversionCount(long long arr[], long long n)
    {
     
        long long temp[n];
        return mergesort(arr,temp,0,n-1);
    }

int main() {
    

        long long N;
        cin >> N;
        
        long long A[N];
        for(long long i = 0;i<N;i++){
            cin >> A[i];
        }
        cout <<inversionCount(A,N) << endl;

    
    return 0;
}