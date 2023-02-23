/*
 * Reduce to 1
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N which is to be reduced to 1 by performing the given operation:-
In one operation you can subtract any divisor of N other than N itself from N.
Your task is to find the minimum number to reduce N to 1.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 1000
Output
Print the minimum number of operations need to convert N to 1.
Example
Sample Input 1:-
5

Sample Output 1:-
3

Explanation:-
5 - > 4 - > 2 - > 1

Sample Input 2:-
8

Sample Output 2:-
3
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int minSteps(int n){
        int[] temp = new int[n+1];
        Arrays.fill(temp, Integer.MAX_VALUE);
        temp[1]=0;
        for(int i = 2; i<=n; i++){
            for(int j = 1; j*j<=i; j++){
                if(i%j ==0){
                    temp[i] = Math.min(temp[i], Math.min(temp[i-j], temp[i-i/j]) +1);
                }
            }
        }
        return temp[n];
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minSteps(n));

    }
}