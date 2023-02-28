/*
 * Yet Another Array Rearrangement Problem (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. In one move, you can choose two indices i, j (1 <= i, j <= N) such that Ai+Aj is odd and swap Ai and Aj. Find the lexicographically smallest array you can obtain after any number of operations.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print N space seperated integers, the lexicographically smallest array you can obtain after any number of operations.
Example
Sample Input:
3
5 2 8

Sample Output:
2 5 8

Explaination:
We can swap 5 and 2 as their sum is odd.
 */



 #include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long

signed main() {
	// Your code here
    int n;
    cin >>n;
    vector<int>a(n);
    for(auto &i:a)cin>>i;
    int odd=0;
    for(auto i:a)
    {
        if(i%2)odd++;
    }
    if(odd!=0 and odd!=n)
    {
        sort(a.begin(), a.end());
    }
    for(auto i:a) cout<<i << ' ';
}