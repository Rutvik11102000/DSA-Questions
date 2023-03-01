/*
Yet Another Counting Problem (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Find the number of pairs of indices (i, j) in the array A such that i < j and Ai - i = Aj - j.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 105
Output
Print the number of pairs of indices (i, j) in the given array A such that i < j and Ai - i = Aj - j.
Example
Sample Input:
4
1 3 3 4

Sample Output:
3

Explaination:
The three pairs of indices are:
(1, 3) -> A[1] - 1 = A[3] - 3 -> 1 - 1 = 3 - 3 -> 0 = 0
(1, 4) -> A[1] - 1 = A[4] - 4 -> 1 - 1 = 4 - 4 -> 0 = 0
(3, 4) -> A[3] - 3 = A[4] - 4 -> 3 - 3 = 4 - 4 -> 0 = 0*/


#include<bits/stdc++.h>
using namespace std;
#define int long long
signed main() {
    int n;
    cin >> n;
    map<int, int> mp;
    int ans = 0;
    for(int i = 1; i <= n; ++i){
        int x;
        cin >> x;
        mp[x - i]++;
    }
    for(auto i:mp)
        ans += i.second * (i.second - 1)/2;
    cout << ans;
}