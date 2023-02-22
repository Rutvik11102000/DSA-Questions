/*
 * Chess Board
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom loves Chess boards. He admires its symmetry and how the black and white colors are placed adjacently along both axis.
More formally, a chessboard-like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.
On his birthday, Tom has been gifted a board which is in the form of an N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colors in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colors available to him. Help him find out the minimum number of cells he will have to recolor to paint his board similar to a chessboard.
Input
The first line contains an integer N, denoting the size of the board
Each of the next N lines contains N space-separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints
1 ≤ N ≤ 1000
Output
A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
Example
Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus he has to color 4 cells.
 */


 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer; 

class Main {
	public static void main (String[] args) 
	{
            FastReader sc = new FastReader();
			int n = sc.nextInt();
        
			int zero=0;
			int one=0;
			for( int i=1; i<=n; i++)
			{
				for( int j=1; j<=n; j++)
				{
					int t_ind=(i+j)%2;
					int inp=sc.nextInt();
					if(t_ind == inp)  zero++;
					else one++;
				}
			}          
       System.out.print(Math.min(one,zero));
	}
static class FastReader 
{
       BufferedReader br;
       StringTokenizer st;

       public FastReader()
       {
        br = new BufferedReader(
            new InputStreamReader(System.in));
       }

      String next()
     {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
      }

     int nextInt() { return Integer.parseInt(next()); }

     long nextLong() { return Long.parseLong(next()); }

     double nextDouble()
    {
        return Double.parseDouble(next());
    }

     String nextLine()
    {
        String str = "";
        try {
            if(st.hasMoreTokens()){
                str = st.nextToken("\n");
            }
            else{
                str = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
}