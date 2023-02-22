/*
 * Implementing Quick Sort
easy
asked in interviews by 15 companies
Problem Statement
Given an array A[] having N positive integers. You need to arrange these elements in increasing order using Quick Sort algorithm.
Input
User Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function quickSort() which contains following arguments.

A[]: input array
start: starting index of array
end: ending index of array

Constraints
1 <= T <= 1000
1 <= N <= 10^4
1 <= A[i] <= 10^5

Sum of "N" over all testcases does not exceed 10^5
Output
For each testcase you need to return the sorted array. The driver code will do the rest.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
 */





 /*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
public static int[] quickSort(int arr[], int l, int r){
    if (l >= r) return arr;
    int pivot = arr[r];
    int pi = partitionIndex(arr, pivot, l, r);
    quickSort(arr, l, pi - 1);
    quickSort(arr, pi + 1, r);
    return arr;
}
public static int partitionIndex(int[] arr, int pivot, int l, int r) {
    int i = l;
    int j = l;
    while (i <= r) {
          if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
          } else {
                i++;
          }
    }
    return j - 1;
}
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}