/*
 * Chessboard Formation
hard
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.

What is the minimum number of moves to transform the board into a "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.
Input
The input line contains T, denoting the number of test cases. Each test case contains two lines. First-line contains N, size of the matrix. Second-line contains N*N elements of binary matrix.

Constraints:
1 <= T <= 100
2 <= N <= 50
0 <= mat[i][j] <= 1
Output
For each testcase you need to print the minimum number of swaps required.
Example
Input:
2
4
0 1 1 0
0 1 1 0
1 0 0 1
1 0 0 1
3
0 1 0
1 0 1
1 1 0

Output:
2
-1

Explanation:
One potential sequence of moves is shown below, from left to right:

0110 1010 1010
0110 --> 1010 --> 0101
1001 0101 1010
1001 0101 0101

The first move swaps the first and second columns.
The second move swaps the second and third row.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
 
// don't change the name of this class
// you can add inner classes if needed
class Main {
     // Your code here
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
        int test_case=sc.nextInt();
        while(test_case-- > 0){
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int result=min_no_of_moves(arr,n);
        System.out.println(result);
    }
 
    }
    public static int min_no_of_moves(int [][] arr , int n)
     {
        for(int i=0;i<n; i++)
        {
            boolean flag_1=true, flag_2=true;
            for(int j=0; j<n; j++)
            {
                if(arr[i][j] == arr[0][j]) flag_1=false; //any ele in first row matches
                if(arr[i][j] != arr[0][j]) flag_2=false; //any else does not match in first row
        }
        if(!flag_1 && !flag_2) return -1;
    }
    int r_s=0,c_s=0,miss_r=0,miss_c=0;  //check board formation index
    for(int i=0; i<n; i++)
    {
        r_s+=arr[0][i];
        c_s+=arr[i][0];
 
        if(arr[i][0] == i%2) miss_r++;
        if(arr[0][i] == i%2) miss_c++;
    }
    if(r_s != n/2 && r_s != (n+1)/2) return -1;
    if(c_s != n/2 && c_s != (n+1)/2) return -1;
 
    if(n%2 == 1)
    {
        if(miss_c%2==1)
        {
            miss_c=n-miss_c;
        }
        if(miss_r%2==1)
        {
            miss_r=n-miss_r;
        }
    }
    else
    {
        miss_r=Math.min(n-miss_r,miss_r);
        miss_c=Math.min(n-miss_c,miss_c);
    }
    return (miss_c+miss_r)/2;                 
    }
}