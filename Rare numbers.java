/*
 Rare numbers
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A number s called rare if all of its digits are divisible by K. Given a number N your task is to check if the given number is rare or not.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Rare() that takes integer N and K as arguments.

Constraints:-
1 <= N <= 100000
1 <= K <= 9
Output
Return 1 if the given number is rare else return 0.
Example
Sample Input:-
2468 2

Sample Output:-
1

Sample Input:-
234 2

Sample Output:-
0

Explanation :
3 is not divisible by 2.

 */


 static int Rare(int n, int k){
    //Enter your code here
    while(n>0){
        if((n%10)%k!=0){
            return 0;
        }
        n/=10;
    }    
    return 1;
    }