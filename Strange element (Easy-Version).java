/*
 * Strange element (Easy-Version)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An element of the matrix is called strange if its corresponding row and column contains all 1's. Given a boolean matrix of size N*M, your task is to find the number of strange elements.
Input
The first line of input contains two space-separated integers N and M. Next N lines of input contain M space-separated integers depicting the values of the matrix.

Constraints:-
3 ≤ N, M ≤ 50
0 ≤ Matrix[][] ≤ 1
Output
Print the number of strange elements
Example
Sample Input:-
3 2
1 1
0 1
1 1

Sample Output:-
2

Sample Input:-
4 4
1 0 1 1
0 1 1 1
1 1 1 1
0 1 1 1

Sample Output:-
2

Explanation 1:-
(0, 1) and (2, 1)
 */

 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int Strange(boolean[][] arr){
        int count= 0;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]){
                    boolean rowAllOnes = true;
                    for(int k=0; k<m; k++){
                    if(!arr[i][k]){
                        rowAllOnes = false;
                        break;
                    }

                }
                boolean colAllOnes = true;
                for(int k=0; k<n; k++){
                    if(!arr[k][j]){
                        colAllOnes = false;
                        break;
                    }
                }
                if(rowAllOnes && colAllOnes){
                    count++;
                }
            }
        }
        }
        return count;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean [][]arr = new boolean[n][m];
        for(int i=0; i<arr.length; i++){
           for( int j=0; j<arr[0].length; j++){
            //   arr[i][j] = sc.nextBoolean();
               int val = sc.nextInt();

              if(val == 1)arr[i][j] = true;

              else arr[i][j] = false;
           }
        
    }
        System.out.println(Strange(arr));
        //Strange(arr);

    }
}