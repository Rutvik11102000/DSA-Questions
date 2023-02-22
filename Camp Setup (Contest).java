/*
 * 
 * Camp Setup (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N points on 2D plane, you have to setup a camp at a point such that sum of Manhattan distance all the points from that point is minimum. If there are many such points you have to find the point with minimum X coordinate and if there are many points with same X coordinate, you have to minimize Y coordinate.
Manhattan distance between points (x1, y1) and (x2, y2) = |x1 - x2| + |y1 - y2|.
Input
First line of input contains N.
Next N lines contains two space separated integers denoting the ith coordinate.

Constraints:
1 <= N <= 100000
1 <= X[i], Y[i] <= 1000000000
Note:- the camp can overlap with the given points and the given points can also overlap(you have to consider overlapping points separately).
Output
Print two space separated integers, denoting the X and Y coordinate of the camp.
Example
Sample Input
3
3 3
1 1
3 2

Sample Output
3 2

Explanation:
Sum of distances = 1 + 3 + 0 = 4
This is the minimum distance possible.
 */

 import java.io.*; // for handling input/output
 import java.util.*; // contains Collections framework
 
 // don't change the name of this class
 // you can add inner classes if needed
 class Main {
     public static void main (String[] args) {
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         long arr1[]= new long[n];
         long arr2[]=new long[n];
         for(int i=0;i<n;i++){
             arr1[i]=sc.nextLong();
             arr2[i]=sc.nextLong();
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
 
         int mid=(int)(Math.ceil((double)(n/2.0)-1));
         System.out.print(arr1[mid]+" "+arr2[mid]);
     }
 }
