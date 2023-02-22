/*
Pattern
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, you have to print the given below pattern for N >= 3.
Pattern for N = 4:-
*
*^*
*^^*
*****
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Pattern() that takes integers N as an argument.

Constraints:-
1 <= N <= 100
Output
Print the given pattern for size N.
Example
Sample input 1:-
3

Sample Output 1:-
*
*^*
****

Sample Input 2:-
6

Sample Output 2:-
*
*^*
*^^*
*^^^*
*^^^^*
*******
*/


static void Pattern(int N){
    //Enter your code here
    int  n=4;
    for(int i=0; i<N; i++){
        if(i==0 || i== N-1){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            if(i==N-1){
                System.out.print("*");
            }
        } else{
            System.out.print("*");
            for(int j=1; j<=i; j++){
                System.out.print("^");
            }
            System.out.print("*");
        }
        System.out.println();
    }
    
    }