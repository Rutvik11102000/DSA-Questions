/*
 * 
 * Counting Zeroes to Ones (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a square matrix of size N*N. Initially all elements of this matrix are equal to 0. You are given Q queries. Each query consists of two integers, i and j (1 <= i, j <= N) wherein you increase the value of all elements in the ith row and jth column by 1. After doing this, for each query print the number of zeroes left in the matrix.
Input
The first line of the input consists of two integers N and Q.
The next Q lines each contains two integers i and j.

Constraints:
1 <= N, Q <= 105
1 <= i, j <= N
Output
For each query print the number of zeroes left in the matrix.
Example
Sample Input:
3 3
1 1
1 2
3 2

Sample Output:
4 2 1

Explaination:
Initially, the matrix will look like:
0 0 0
0 0 0
0 0 0

After the first query, the matrix will look something like this:
1 1 1
1 0 0
1 0 0
Number of zeroes = 4

After the second query, the matrix will look something like this:
1 1 1
1 1 0
1 1 0
Number of zeroes = 2

After the third query, the matrix will look something like this:
1 1 1
1 1 0
1 1 1
Number of zeroes = 1

 */





 #include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long

signed main()
{
    int a, r = 0, c = 0;
    cin >> a;
    int k;
    cin >> k;
    int ans = a * a;
    vector<int> row(a + 1), col(a + 1);
    while (k--)
    {
        int i, j;
        cin >> i >> j;
        if (row[i] == 0)
            ans -= a - c, row[i] = 1, r++;
        if (col[j] == 0)
            ans -= a - r, col[j] = 1, c++;
        cout << ans << ' ';
    }
}