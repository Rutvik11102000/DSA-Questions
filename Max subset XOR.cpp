/*
 * 
 * Max subset XOR
hard
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a set of positive integers. Find the maximum xor of a non-empty subset from the given set.
Input
The first line contains an integer N denoting the number of elements in the set.
The next line contains N integers denoting the elements of the set.

1 <= N <= 10^5
1 <= Elements of set <= 10^9
Output
Print the maximum subset Xor.
Example
Sample Input:
3
2 4 5

Sample Output:
7

Explanation:
Subset {2, 5} has the maximum xor

Sample Input:
3
9 8 5

Sample Output:
13

Explanation:
Subset {8, 5} has the maximum xor
 */




 #include<bits/stdc++.h>
using namespace std;
class Solution
{
    public:
    int maxSubarrayXOR(int arr[], int N)
    {
        if(N == 0) return 0;
int x = 0;
while(1)
{
  int y = *max_element(arr,arr+N);
  if(y == 0) return x;
  x = max(x,x^y);
  for(int i=0;i<N;i++)
  {
    arr[i] = min(arr[i],arr[i]^y);
  }
}
    }
};

int main()
{

    int t,n,a[100004],k;

       scanf("%d",&n);
        for(int i=0;i<n;i++)
        {
            scanf("%d",&a[i]);
        }
        Solution obj;
        printf("%d\n",obj.maxSubarrayXOR(a,n));
}
