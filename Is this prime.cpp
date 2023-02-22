/*
Is this prime?
hard
asked in interviews by 26 companies
Time Limit: 1 sec
Memory Limit: 128000 kB
Problem Statement
Let's assume some functional definitions for this problem.
We take prime(x) as the set of all prime divisors of x. For example, prime(140)={2,5,7}, prime(169)={13}.

Let f(x,p) be the maximum possible integer p**k where k is an integer such that x is divisible by p**k.
(Here a**b means a raised to the power b or pow(a, b))
For example:
f(99,3)=9 (99 is divisible by 3**2=9 but not divisible by 3**3=27),
f(63,7)=7 (63 is divisible by 7**1=7 but not divisible by 7**2=49).

Let g(x,y) be the product of f(y,p) for all p in prime(x).
For example:
g(30,70)=f(70,2)*f(70,3)*f(70,5)=2*1*5=10,
g(525,63)=f(63,3)*f(63,5)*f(63,7)=9*1*7=63.

You are given two integers x and n. Calculate g(x,1)*g(x,2)*…*g(x,n) mod (1000000007).

(Read modulo exponentiation before attempting this problem)
Input
The only line contains integers x and n — the numbers used in formula.

Constraints
2 ≤ x ≤ 1000000000
1 ≤ n ≤ 1000000000000000000
Output
Print the answer corresponding to the input.*/


#include<bits/stdc++.h>
#pragma GCC optimize "03"
using namespace std;
#define driver main
#define int long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif
 
const int N = 2e5 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;

int power(int a, int b){
	int ans = 1;
	b %= (mod-1);
	while(b){
		if(b&1)
			ans = (ans*a) % mod;
		b >>= 1;
		a = (a*a) % mod;
	}
	return ans;
}

int f(int n, int p){
	int ans = 1;
	int cur = 1;
	while(cur <= n/p){
		cur = cur*p;
		int z = power(p, n/cur);
		ans = (ans*z) % mod;
	}
	return ans;
}

signed driver() {
	IOS;
	int x, n, ans = 1;
	cin >> x >> n;
	for(int i = 2; i*i <= x; i++){
		if(x%i != 0)	continue;
		ans = (ans*f(n, i)) % mod;
		while(x%i == 0)
			x /= i;
	}	
	if(x > 1)
		ans = (ans*f(n, x)) % mod;
	cout << ans;
	return 0;
}