/*
 * Candy Shopping
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N candies, ith of them costing pi. You have M amount of money with you. Find the maximum number of candies you can buy.
Input
The first line of the input contains two integers N and M.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= M <= 1014
1 <= pi <= 109
Output
Print the maximum number of candies you can buy.
Example
Sample Input:
4 7
3 1 4 2

Sample Output:
3
 */



 #include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

#define int long long 

signed main(){
	int n, m;

    cin >> n >>m;
    vector<int>p(n);
    for(auto &i:p) cin >> i;
    sort(p.begin(),p.end());
    int cur=0,ans=0;
    for(int i=0;i<n;i++){
        if(cur+p[i] > m){
            break;
        }
        cur+=p[i];
        ans++;
    }
    cout<<ans;
}