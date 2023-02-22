/*
 * Median of Two sorted Arrays
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
Input
The first line of input contains n, m the length of arrays A and B.
The next two lines contain the input of arrays A and B.

Constraints
1 ≤ n, m ≤ 1000
-106 ≤ A[i], B[i] ≤ 106
Output
Print the median of two sorted arrays upto two decimal places.
Example
Sample Input :
2 1
1 3
2

Sample Output :
2.00
 */



 #include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

double findMedianSortedArrays(vector<int>&nums1,vector<int>&nums2){
    if(nums2.size()<nums1.size())
    return findMedianSortedArrays(nums2,nums1);
    int n1=nums1.size();
    int n2=nums2.size();
    int lo = 0,hi=n1;
    while(lo<=hi){
        int cut1 = (lo+hi)/2;
        int cut2 = (n1+n2+1)/2-cut1;
        int left1 = cut1==0? INT_MIN:nums1[cut1-1];
         int left2 = cut2==0? INT_MIN:nums2[cut2-1];

         int right1 = cut1==n1? INT_MAX:nums1[cut1];
         int right2 = cut2==n2? INT_MAX:nums2[cut2];

         if(left1<=right2 && left2 <= right1){
             if((n1+n2) %2==0)
             return(max(left1,left2)+ min(right1,right2)) /2.0;
             else
             return max(left1,left2);
         }else if(left1>right2){
             hi=cut1-1;
         }else
         lo= cut1+1;
    }
 return  0.0;
}
int main() {
	// Your code here
     int n,m;
     cin>>n>>m;
     vector<int>a(n),b(m);
     for(int i=0; i<n; i++){
         cin>>a[i];
     }for(int i=0;i<m; i++){
         cin>>b[i];
     }
     printf("%0.2f",findMedianSortedArrays(a,b));
    return 0;
}