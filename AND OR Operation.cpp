/*
 * AND OR Operation
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given the following pseudocode:

code :
res = a
for i = 1 to k
if i is odd
res = res & b
else
res = res | b

You are also given the values of a, b and k. Find the value of res.
Input
First line contains of single integer t denoting number of test cases.
Each test cases consists of 3 lines where each line consists of a single integer denoting the values of a, b and k respectively.

Constraints
1<= T <= 1e5
1<= a, b, k <= 1e18
Output
Print the final value of res for each test case in a new line
Example
Sample Input :
1
4 5 1

Sample Output :
4
 */



 #include<bits/stdc++.h>
using namespace std;
#define ll long long int 
#define ld long double
#define endl '\n'
#define pb push_back
#define sz(c) (ll)c.size()
#define mp make_pair
#define all(v) v.begin(),v.end()
#define rep(i,a,b) for(ll i=a;i<b;i++)
#define F first
#define S second
#define M 1000000007
#define PI 3.1415926535897932384
#define pii pair<ll,ll>
 
const ll INF=1e18;
const ll N=1e5+5;
ll mod=998244353;
typedef pair<ll,ll> pi;
typedef vector<ll> vi;
typedef vector<bool> vb;
typedef vector<char> vc;
typedef vector<pair<ll,ll>> vp;
typedef vector<vector<ll>> vvi;
typedef vector<vector<bool>> vvb;
typedef vector<vector<char>> vvc;
typedef vector<vector<pair<ll,ll>>> vvp;
void null(){
    ll a,b,k;
    cin>>a>>b>>k;
    ll ans=a&b;
    if(k==1)
    cout<<ans<<endl;
    else
    cout<<b<<endl;
}
 
signed main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(0);    
    cout<<setprecision(7);
    cout<<fixed;
    ll t = 1;
    clock_t start, end; 
    start = clock(); 
    cin>>t;
    while(t--){
        null();
    }
    end = clock();
    double time_taken = double(end - start) / double(CLOCKS_PER_SEC); 
}