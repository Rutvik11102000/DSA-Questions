/*
 * Subarray with given sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
Input
Each test case consists of two lines. The first line of each test case is N and S, where N is the size of the array and S is the sum. The second line of each test case contains N space-separated integers denoting the array elements.

Constraints:-
1 ≤ N ≤ 105
1 ≤ Ai ≤ 105
Output
Print the starting and ending positions (1 indexing) of first such occurring subarray from the left if sum equals to subarray, else print -1.
Example
Sample Input
5 12
1 2 3 7 5

Sample Output
2 4

Explanation:
subarray starting from index 2 and ending at index 4 => {2 , 3 , 7}
sum = 2 + 3 + 7 = 12

Sample Input
10 15
1 2 3 4 5 6 7 8 9 10

Sample Output
1 5
 */



 // Subarray with given sum

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }


        Long sum = (long)0;
        HashMap<Long, Integer> myMap = new HashMap();
        int start = -1, end = -1;
        for(int i=0; i<n; i++){
            sum += a[i];

            if(sum == k){
                start = 1;
                end = i+1;
                break;
            }

            long diff = sum - k;
            if(myMap.containsKey(diff)){
                start = myMap.get(diff) + 1;
                end = i+1;
                break;
            }

            myMap.put(sum, i+1);
        }

        if(start == -1 && end == -1)
            System.out.println(-1);
        else
            System.out.println(start + " " + end);
    }
}