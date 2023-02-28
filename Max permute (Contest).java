/*
 * Max permute (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N. You have to construct an array Arr of N integers such that it contains integers from 1 to N and each integer comes at max once. The goodness of the array is summation (Arr[i]%i) for i from 1 to N.
You have to construct array with maximum goodness. As N can be huge you only have to report the maximum goodness and not the array.
Input
Input contains a single integer N.

Constraints:
1 <= N <= 1000000000
Output
Print the maximum goodness possible.
Example
Sample Input
2

Sample Output
1

Explanation: Array constructed will be [2, 1] goodness = 1%2 + 2%1 = 1

Sample Input
5

Sample Output
10

Explanation: Array constructed will be [1, 3, 4, 5, 2] goodness = 1%1 + 2%3 + 3%4 + 4%5 + 5%2 = 10
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        long n = inp.nextLong();
        long sum = 0;
        sum = ((n-1)*n)/2;
        System.out.print(sum);
    }
}