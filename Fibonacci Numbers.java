/*
 * Fibonacci Numbers
easy
asked in interviews by 40 companies
Problem Statement
Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

In the fibonacci series, each number (Fibonacci number) is the sum of the two preceding numbers. The series with 0 and 1 as seed values will go like -
0, 1, 1, 2, 3, 5 and so on..
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Fibonacci() that takes the integer N as a parameter.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 30
Output
Return the Nth Fibonacci number.
Example
Sample Input
2
3
5

Sample Output
2
5

Explaination:
Test case 1-> N = 2
Seed values are 0 and 1
So, F1 = 0 + 1 = 1
F2 = 1 + F1 = 1 + 1 = 2
 */



 static long  Fibonacci(long  n) 
 { 
     if(n == 0){
         return 0;
     }
     if(n<=2){
         return 1;
     }
   long fibSum = Fibonacci(n-1)+Fibonacci(n-2);
    return fibSum;
 }
