/*
 * The gabba test
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Australia hasn’t lost a Test Match at the Gabba since 1988. India has to win this one, but unfortunately all of their players are injured.

You are given the following information:
1. A total of N players are available, all are injured initially.
2. You have M magic pills. Using X pills, you can make any one player fit for match.
3. Alternatively, you can exchange any player for Y magic pills.

Compute the maximum number of players you can make fit for the Gabba Test Match.

Note: "Exchanging" a player means that player will no longer be available and you will gain Y extra magic pills for the exchange
Input
The input contains a single line containing 4 integers N M X Y.

Constraints:-
0 ≤ N, M, X, Y ≤ 10^9
Output
The output should contain a single integer representing the maximum number of players you can make fit before the match.
Example
Sample Input:-
5 10 2 1

Sample Output:-
5

Explanation:-
You can make all players fit if you use all the pills.

Sample Input:-
3 10 4 2

Sample Output:-
2

Explanation:-
You can make 2 players fit using the initial candies. Otherwise, Exchanging one player would result in a total of 10+2=12 magic pills. This is enough to make 3 players fit, but you won't have 3 players remaining.
 */





 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long l = 0, r= n;
        long s= 0;
        while(l<=r){
            long m1=l+(r-l)/2;
            if(a*m1<=m+(n-m1)*b){
                s=m1;
                l=m1+1;
            }
            else{
                r = m1-1;
            }
        }
        System.out.println(s);
        
    }
}