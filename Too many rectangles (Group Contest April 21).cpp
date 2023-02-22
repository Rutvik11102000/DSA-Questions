/*
Too many rectangles? (Group Contest: April '21)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Why Geometry?? ?

You are given 4*N+1 distinct points on the cartesian plane. Out of these points, 4*N points represent the end points of N rectangles (with axis parallel to co-ordinate axis), while one point does not belong to any of the rectangles. Report the coordinates of the point that does not belong to any of the N rectangles.
Input
The first line of the input contains an integer N.
The next 4*N+1 lines contain two integers X and Y, the coordinates of the given points.

Constraints
1 <= N <= 100000
0 <= X, Y <= 1000000
The given points always represent N rectangles and an extra point
Output
Output space separated X and Y coordinates of the extra point.
Example
Samle Input
1
1 3
1 1
3 1
1 4
3 3

Sample Output
1 4

Explanation: (1, 1), (1, 3), (3, 1), and (3, 3) represent the end of a rectangle, while (1, 4) is the extra point.
*/



#include<bits/stdc++.h>
# define lli long long int
# define pb push_back
# define ff first
#define ss second
using namespace std;
void fast(){
	ios_base::sync_with_stdio(0);cin.tie(0); cout.tie(0);
}
int main()
{
     fast();
     int t=1;
     while(t--)
     {
          
          lli n,i,j,c=0,ansx=0,ansy=0,x,y;
          cin>>n;
          n=4ll*n+1ll;
          map<lli,lli> mpx;
          map<lli,lli> mpy;
          for(i=0;i<n;i++)
          {
               cin>>x>>y;
               mpx[x]++;
               mpy[y]++;
          }
          for (auto itr = mpx.begin(); itr != mpx.end(); ++itr)
          {
               x=itr->ss;
               if(x%2==0)
               continue;
               else
               {
                    ansx=itr->ff;
                    break;
               }
          }
          for(auto itr1 = mpy.begin(); itr1 != mpy.end(); ++itr1)
          {
               y=itr1->ss;
               if(y%2==0)
               continue;
               else
               {
                    ansy=itr1->ff;
                    break;
               }
          }
          cout<<ansx<<" "<<ansy<<endl;
     }
     return 0;
}