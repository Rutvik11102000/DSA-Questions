/*
Setwet's Fish Pond
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Setwet owns a very long fish pond. He plans to breed different types of carps in the upcoming breeding season. The area, however, is full of seagulls and Setwet fears that they might prey on most of the carps. For this reason, he has decided to place some seagulls- killing sharks (sharks hate carps' flavour and won't ever eat them) at different locations of the fish pond.
The fish pond can be modelled as a 1 x N grid. Some parts of the fish pond are dried out and that means you cannot breed any carps on them. A sharks, when placed on a spot, covers the cell to its immediate left and right along with the cell it is on.
Given the description of the fish pond, what is the minimum number of sharks that needs to be placed so that all the useful section of the fish pond is covered? Useful section refers to cells where carps can be bred.
Input
Input starts with an integer T, denoting the number of test cases.
Each case starts with a line containing an integer N. The next line contains N characters that describe the pond. A dot (. ) indicates a carp- breeding spot and a hash (#) indicates a dried out region.

Constraints:-
1 < T ≤ 50
1 ≤ N < 10^9
Output
For each case, print the number of sharks that need to be placed.
Example
Sample Input:-
3
3
. #.
11
. ##. ##
2
##

Sample Output:-
1
3
0*/


#include <bits/stdc++.h> 
#define ll long long
#define MOD 1000000007
#define endl "\n"
#define vll vector<long long>
#define pll pair<long long , long long>
#define all(c) c.begin(), c.end();
#define f first
#define s second
#define inf INT_MAX
#define size_1d 10000000
#define size_2d 10000
#define mem(a,val) memset(a,val,sizeof(a))

using namespace std;
ll N, ans;
char arr[size_1d];
void Input(){
    cin >> N;
    for(ll i=0;i<N;i++)
    cin >> arr[i];
}
void Solve(){
    ans = 0;
    for(ll i=0;i<N;i++){
        if(arr[i] == '.'){
            ans++;
            arr[i] = '#';
            if(i+1<N)
                arr[i+1] = '#';
            if(i+2<N)
                arr[i+2] = '#';
        }
    }
    cout << ans << endl;
}
int main() {
	// Your code here
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll T = 1;
    cin >> T;
    ll t = 1;
    while(T--){
        Input();
        Solve();
    }
    return 0;
}