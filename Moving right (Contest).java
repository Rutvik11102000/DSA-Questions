/*
 * Moving right (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of heights of N buildings in a row. You can start from any building and jump to the adjacent right building till the height of the building to the right is less than or equal to the height of your current building. Find the maximum number of jumps you can make.
Input
The first line of input contains a single integer N.
The second line of input contains N integers, denoting the array height.

Constraints:
1 <= N <= 105
1 <= height[i] <= 109
Output
Print the maximum number of jumps you can make.
Example
Sample Input:-
5
5 4 1 2 1

Sample Output:-
2

Explanation:
We start from building with height 5 then jump right to building with height 4 then again to building with height 1 making a total of 2 jumps.
 */


 // Moving right

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        int jump = 0;
        int maxJumps = 0;
        for(int i=1; i<n; i++){
            if(a[i-1] >= a[i]){
                jump++;
            }
            else{
                jump = 0;
            }

            if(jump > maxJumps)
                maxJumps = jump;
        }

        System.out.println(maxJumps);
    }
}