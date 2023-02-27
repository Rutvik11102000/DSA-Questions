Problem Statement
Given an array of n numbers, sorted in non-decreasing order, and k queries. For each query, print the minimum index of an array element not less than the given one.
Input
The first line of the input contains n and k.
The second line contains n elements of the array, sorted in non- decreasing order.
The third line contains k queries. All array elements and queries are integers, each of which does not exceed 2.109.

Constraints
0 ≤ n, k ≤ 105
Output
For each of the k queries, print the minimum index of an array element not less than the given one. If there are none, print n+1.
  
  import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int q = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        while (q-- > 0) {
            int x = inp.nextInt();
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] <= x) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(l);
        }
    }
}
