/*
 * Pair sum (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr, of N integers find the sum of max(A[i], A[j]) for all i, j such that i < j.
Input
The first line of the input contains an integer N, the size of the array.
The second line of the input contains N integers, the elements of the array Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 100000000
Output
Print a single integer which is the sum of min(A[i], A[j]) for all i, j such that i < j.
Example
Sample Input 1
4
5 3 3 1

Sample Output 1
24

Sample Input 2
2
1 10

Sample Output 2
10

Explanation 1
max(5,3) + max(5,3) + max(5,1) + max(3,3) + max(3,1) + max(3,1) = 24
 */




 // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long[] arr = new long[n];
for(int i = 0; i< arr.length ; i++){
arr[i] = sc.nextInt();
}

        // long max_value;
        // long sum = 0;
        // for(int i = 0; i< arr.length-1; i++){
        //     for(int j = i+1; j<arr.length ; j++){
        //         if(i<j){
        //           max_value = Math.max(arr[i], arr[j]);
        //           sum = sum + max_value;
        //         }
        //     }
        // }
        // System.out.print(sum);
        long sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i< arr.length ; i++){
            sum = sum + (i*arr[i]);
        }
         System.out.print(sum);
    }


}