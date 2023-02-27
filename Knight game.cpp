/*
Knight game
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a 100*100 chessboard. A knight is placed on cell (i, j). You have to find the number of blocks on the chessboard that the knight can be at in exactly N moves.
Input
Input contains three integers i j N.

Constraints

1 <= i, j <= 100
1 <= N <= 10
Output
Output a single integer, the number of blocks on the chessboard that the knight can be at in exactly N moves.
Example
sample input 1
1 1 1

sample output 1
2

sample input 2
50 50 1

sample input 2
8
*/



#include <bits/stdc++.h>


using namespace std;

#define MEM(a, b) memset(a, (b), sizeof(a))

#define FOREACH(it, l) for (auto it = l.begin(); it != l.end(); it++)

#define IN(A, B, C) assert( B <= A && A <= C)

#define MP make_pair
#define FOR(i,a) for(int i=0;i<a;i++)

#define FOR1(i,j,a) for(int i=j;i<a;i++)

#define EB emplace_back

#define INF (int)1e9

#define EPS 1e-9

#define PI 3.1415926535897932384626433832795

#define MOD 1000000007

#define read(type) readInt<type>()
#define max1 1000001
#define out(x) cout<<x<<'\n'
#define out1(x) cout<<x<<" "
#define END cout<<'\n'
const double pi=acos(-1.0);

typedef pair<int, int> PII;

typedef vector<int> VI;

typedef vector<string> VS;

typedef vector<PII> VII;

typedef vector<VI> VVI;

typedef map<int,int> MPII;

typedef set<int> SETI;

typedef multiset<int> MSETI;

typedef long int li;

typedef unsigned long int uli;

typedef long long int ll;

typedef unsigned long long int  ull;

bool isPowerOfTwo (int x)
{
  /* First x in the below expression is
    for the case when x is 0 */
  return x && (!(x&(x-1)));
}
void fast(){
ios::sync_with_stdio(0);
cin.tie(0);
cout.tie(0);
}
ll power(ll x, ll y, ll p)
{
    ll res = 1;      // Initialize result

    x = x % p;  // Update x if it is more than or
                // equal to p

    while (y > 0)
    {
        // If y is odd, multiply x with result
        if (y & 1)
            res = (res*x) % p;

        // y must be even now
        y = y>>1; // y = y/2
        x = (x*x) % p;
    }
    return res;
}

// Returns n^(-1) mod p
ll modInverse(ll n, ll p)
{
    return power(n, p-2, p);
}

// Returns nCr % p using Fermat's little
// theorem.
ll ncr(ll n, ll r,ll p)
{
   // Base case
   if (r==0)
      return 1;

    // Fill factorial array so that we
    // can find all factorial of r, n
    // and n-r
    ll fac[n+1];
    fac[0] = 1;
    for (ll i=1 ; i<=n; i++)
        fac[i] = fac[i-1]*i%p;

    return (fac[n]* modInverse(fac[r], p) % p *
            modInverse(fac[n-r], p) % p) % p;
}



set<pair<int,int>> s;

bool dp[101][101][11];
void solve(int i, int j, int n){

if(n==0){
s.insert(make_pair(i,j));
return ;}
 int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
    int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
    int cnt=0;
    for(int k=0;k<8;k++){
    if((i+dx[k])>=1 && (i+dx[k])<=100){
        if((j+dy[k])>=1 && (j+dy[k])<=100){
                if(dp[i+dx[k]][j+dy[k]][n]==false){
                   dp[i+dx[k]][j+dy[k]][n]=true;
            solve(i+dx[k],j+dy[k],n-1);}
        }
    }
    }

}
int main(){
int a,b,c;
cin>>a>>b>>c;
FOR(i,101){
    FOR(k,101){
FOR(j,11){
dp[i][k][j]=false;}}}
dp[a][b][c]=true;
solve(a,b,c);
cout<<s.size();

}