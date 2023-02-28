/*
 * Wakandan Point in Unsorted Array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
For her summer holidays HW, Morgan Stark has to find the first Wakandan Point in an array of n positive numbers. The Wakandan Point in an array is the position where the sum of elements before it is equal to the sum of elements after it.
Given an unsorted array A[] of size N containing positive integers. The task is to find the Wakandan Point (E) in this array

Wakandan Point: The Wakandan Point is the index E where the sum of all elements to the left is equal to the sum of all the elements present to the right of it i.e. A[0]+A[1]+A[2]+...+A[E-1] is equal to A[E+1]+A[E+2]+...+A[N-1].
Input
The first line of input contains a single integer N size of array, next line contains N space separated integers denoting the elements of the array.


Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^4
Output
You need to print the Wakandan Point if found else print -1.
Example
Sample Input 1
4
2 1 3 3

Sample Output 1
2

Sample Input 2
5
3 5 6 2 1

Sample Output 2
-1

Explanation:
Testcase 1: Unsorted sequence 2 1 3 3 posses 2 as equilibrium index because (A[0]+A[1]) is equal to A[3]
 */



 import java.util.*;

public class Main {
  public static int findWakandaPoint(int[] arr) {
    int n = arr.length;
    int leftSum = 0;
    int rightSum = 0;
    for (int i = 0; i < n; i++) {
      rightSum += arr[i];
    }
    for (int i = 0; i < n; i++) {
      rightSum -= arr[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += arr[i];
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(findWakandaPoint(arr));
  }
}