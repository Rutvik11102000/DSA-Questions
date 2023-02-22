/*
 * Boundary Traversal of Matrix
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.
Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++){
            int rows=sc.nextInt();
            int columns=sc.nextInt();
            int [][] arr= new int[rows][columns];
            for(int j=0; j<rows; j++){
                for(int k=0; k<columns; k++){
                    arr[j][k]=sc.nextInt();
                }
            }
            boundaryTraversal(arr,rows,columns);
            System.out.println(" ");
        }
    }
    public static void boundaryTraversal(int [][] arr, int rows, int columns){
        for(int i=0; i<columns; i++){
            System.out.print(arr[0][i]+" ");
        }
        for(int i=1; i<rows; i++){
            System.out.print(arr[i][columns-1]+" ");
        }
        // System.out.println(" ");
        if(rows>1){
            for(int i=(columns-2); i>=0; i--){
                System.out.print(arr[rows-1][i]+" ");
            }
        }
        // System.out.println(" ");
        if(columns>1){
            for(int i=(rows-2); i>0; i--){
                System.out.print(arr[i][0]+" ");
            }
        }
    }
}