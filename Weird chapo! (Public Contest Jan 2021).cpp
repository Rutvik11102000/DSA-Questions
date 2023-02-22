/*
Weird chapo! (Public Contest: Jan 2021)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Rick wants to give Morty a chapo (a super awesome treat :P).

The only condition for Morty to get a chapo is that he should be able to reach Rick's place. Both Rick and Morty live on the number line at integer points A and B respectively. There are N types of moves M1, M2,. , MN. Morty can only take steps of size Mi (1 <= i <= N) in either of the two directions on the number line (any number of times), while Rick prefers to stay at his place.

Please let Morty know if he can ever reach Rick's place and get a chapo.
Input
The first line of the input contains three integers N, A, and B denoting the total number of step sizes, the position of Rick, and the position of Morty.
The next line contains N integers Mi denoting the various step sizes that Morty can take.

Constraints
1 <= N <= 200000
1 <= Mi <= 109
-109 <= A, B <= 109
Output
Output Yes if Morty can reach Rick's place, else output No
Example
Sample Input
3 19 2
3 5 4

Sample Output
Yes

Explanation: Morty lives at position 2, while Rick lives at position 19. Morty can take the following path to reach Rick's place (there are several other ways as well):
Move M2 = 5 to the right.
Move M1 = 4 to the right.
Move M1 = 4 to the right.
Move M1 = 4 to the right.

Sample Input 2
4 10 15
10 20 30 40

Sample Output 2
No*/


#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define rutvik
ll gcd(ll a, ll b) { return b ? gcd(b, a%b) : a; }


int32_t main()
{
	ll n;
	ll rick,morty;
	cin>>n>>rick>>morty;

	ll gc;

	for(int i=0;i<n;i++) {
		ll s;cin>>s;
		gc=(i==0)? s: gcd(gc,s);
	}
	
	ll val = abs(morty-rick);
	
	if(val%gc==0) {
		cout<<"Yes\n";
	} else {
		cout<<"No\n";
	}
	return 0;
}


// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
// class Main {
//     public static int gcd(int a,int b){
//         if(b==0)
//             return a;
//         return gcd(b,a%b);
//     }

// 	public static void main (String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int ricky=sc.nextInt();
//         int morty=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }    
//         int diff=Math.abs(ricky-morty);

//         int hcf=a[0];
//         for(int i=1;i<n;i++){
//             hcf=gcd(hcf,a[i]);
//         }
        
//         if(diff%hcf==0){
//             System.out.print("Yes");
//         }else{
//             System.out.print("No");
//         }

//     }
// }