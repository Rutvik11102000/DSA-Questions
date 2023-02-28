/*
 * Maximizing Difference
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an integer N and two arrays A and B each of size N. In one move, you can swap any integer from array A with that of array B, they don't need to have the same index. Let sumA be the sum of elements of array A and sumB be the sum of the elements of array B. Find the maximum possible value of sumA - sumB possible after applying optimal moves.
Input
First line of the input contains an integer N,
The second line of the input contains N space seperated integers of array A,
The third line of the input contains N space seperated integers of array B.

Constraints:
1 <= N <= 105
1 <= Ai, Bi <= 109
Output
Print the maximum possible value of sumA - sumB possible after apply optimal moves.
Example
Sample Input:
5
7 9 4 4 2
8 3 2 4 1

Sample Output:
20

Explaination:
We swap B1 with A5, This makes A = [7, 9, 4, 4, 8], B = [2, 3, 2, 4, 1]. sumA = 32.
sumB = 12.
sumA - sumB = 20
It can be proved that this is the maximum possible difference.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0;
        int p2 = n-1;

        for(int i =0; i<n; i++){
            if(arr1[p1] < arr2[p2]){
                int temp1 = arr1[p1];
                int temp2 = arr2[p2];
                arr1[p1] = temp2;
                arr2[p2] = temp1;
                p1++;
                p2--;
            }
        }

        long sum1 = 0;
        long sum2 = 0;



        for(int i=0; i<n; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];

        }

    System.out.println(sum1-sum2);












    }
}