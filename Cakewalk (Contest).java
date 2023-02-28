/*
 * Cakewalk? (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Taro is super small, she has recently learned the skill of walking. She wants to walk on the road from l to r (l < r, l and r must be integers). She cannot walk over a cake.
The road starts from 1 and goes till n (both inclusive). There are m cakes placed on the road at coordinates a[1], a[2],..., a[m].
Please help Taro find the number of ways she can choose l, r.
Note: She cannot choose l and r such that l <= a[i] <= r, for all values of i from 1 to m.
Input
The first line of the input contains two integers n, m.
The next line contains m integers, a[1], a[2], ..., a[m].

(There may be many cakes at the same location)

Constraints
1 <= n <= 2000
0 <= m <= 2000
1 <= a[i] <= n
Output
Output a single integer, the number of distinct (l, r) pairs on which Taro can walk.
Example
Sample Input
7 2
3 7

Sample Output
4

Explanation: The ways of choosing (l, r) pairs are (1, 2), (4, 5), (4, 6), (5, 6).
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        long cnt=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                boolean valid=true;
            for(int k=0;k<m;k++)
            {
                if(i<=arr[k]&&arr[k]<=j)
                {
                    valid=false;
                    break;
                }
            }
            if(valid)
            {
                cnt++;
            }
            }
        }
        System.out.print(cnt);
    }
}