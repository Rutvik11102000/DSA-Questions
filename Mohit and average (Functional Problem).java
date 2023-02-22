/*
 * Mohit and average (Functional Problem)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mohit has three integers A, B, and C with him he wants to find the average of these three integers however he is weak in maths, so help him to find the average. You need to report the floor of the average value.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Average() that takes integers A, B, and C as arguments.

Constraints:-
1 <= A, B, and C <= 10000
Output
Return the floor of average of these numbers.
Example
Sample Input:-
3 4 5

Sample Output:-
4

Sample Input:-
3 4 4

Sample Output:-
3
 */


 static int Average(int A,int B, int C){
    //Enter your code her
    int average =   (A+B+C)/3;
    return average;
    }