/*
Generator - Super Prime
medium
Problem Statement
For a given integer N, super primes are those integers from 1 to N whose multiples (other than themselves) do no exist in the range [1, N].
Your task is to generate all super primes <= N in sorted order.

Note: Super primes are not related to primes in any way.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SuperPrime() that takes the integer N as a parameter.

Constraints:-
2 < = N <= 1000
Output
Printing will be done by the driver code you just need to complete the generator function.
Example
Sample Input:-
5

Sample Output:-
3 4 5

Sample Input:-
4

Sample Output:-
3 4
*/




def SuperPrimes(N):

    for i in range (int(N//2)+1,N+1):

        yield i
    return