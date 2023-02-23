/*
 * Maximum Area
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Saurabh has a paper of size N*M and some horizontal and vertical lines in the form of arrays. Saurabh wants to know the maximum area which is trapped inside the lines.

Note:- Consider the boundary of the paper to be vertical and horizontal lines. Also consider 0 indexing
Input
The first line of input contains 4 space separated integers depicting N, M, size of array contains horizontal lines(H), size of array containing vertical lines(V). The second line contains H space separated integers depicting horizontal lines. Last lines contains V space separated integers depicting vertical lines.

Constraints:-
1 <= N, M <= 1000000000
1 <= H, V <= 100000
0 <= horizontal lines <= N
0 <= vertical lines <= M
Output
Print the maximum area trapped between the lines
Example
Sample Input:-
5 4 3 2
1 2 4
1 3

Sample Output:-
4

Explanation:-
The area is- (2,1), (2,3) (4,1) (4,3)

Sample Input:-
5 4 2 1
3 1
1

Sample Output:-
6
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int area(int n ,int m,int h[],int v[]){
        Arrays.sort(h);
        Arrays.sort(v);
        int mh =Math.max(h[0],n-h[h.length-1]);
        int mv =Math.max(v[0],m-v[v.length-1]);
        for(int i =0;i<h.length-1;i++){
            mh = Math.max(mh,h[i+1]-h[i]);
        }
        for(int i =0;i<v.length-1;i++){
            mv =Math.max(mv,v[i+1]-v[i]);
        }
        return(int)((long)mh*mv%1000000007);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M = sc.nextInt();
        int H = sc.nextInt();
        int v =sc.nextInt();
        int a[]=new int[H];
        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int b[] = new int [v];
        for(int i =0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(area(N,M,a,b));
        
    }
}