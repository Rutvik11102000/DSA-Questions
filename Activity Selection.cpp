#include<bits/stdc++.h>

//#define int            long long

#define ll             long long

#define pb          push_back

#define    endl        '\n'

#define pi          pair<int,int>

#define vi          vector<int>

#define all(a)      (a).begin(),(a).end()

#define fi          first

#define se          second

#define sz(x)       (int)x.size()

#define hell        1000000007

#define rep(i,a,b)  for(int i=a;i<b;i++)

#define dep(i,a,b)  for(int i=a;i>=b;i--)

#define lbnd        lower_bound

#define ubnd        upper_bound

#define bs          binary_search

#define mp          make_pair

using namespace std;



const int N = 2e5 + 5;

const int mod = 1e9 + 7;

const int inf = 1e9 + 9;



pi a[N];

int dp[N];

map<int, int> m;

vector<int> v[N];



void solve(){

    int n;  cin >> n;

    for(int i = 1; i <= n; i++){

        cin >> a[i].fi >> a[i].se;

        m[a[i].fi] = m[a[i].se] = 1;

    }

    int p = 1;

    for(auto &i: m){

        i.se += p;

        p = i.se;

    }

    for(int i = 1; i <= n; i++){

        a[i].fi = m[a[i].fi];

        a[i].se = m[a[i].se];

        v[a[i].se].push_back(a[i].fi);

    }

    for(int i = 1; i < N; i++){

        dp[i] = dp[i-1];

        for(auto j: v[i])

            dp[i] = max(dp[i], 1 + dp[j-1]);

    }   

    cout << dp[N-2];

}

void testcases(){

    int tt = 1; 

    //cin >> tt;

    while(tt--){

        solve();

    }
}
signed main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
 		clock_t start = clock();

    testcases();

 		cerr << (double)(clock() - start)*1000/CLOCKS_PER_SEC << " ms: ";

    return 0;

}
