/*
 * 
 * Remove Duplicates Inplace
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sorted array, remove the duplicates in place such that each element appears at most twice and returns the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.
Input
First-line will contain a single integer N denoting array length
Second-line will contain the elements of the array

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^5
Output
Print the length of the final array
Example
Sample Input:
4
1 1 1 2

Sample Output:
3

Explanation:-
A is now [1,1,2].

Sample Inpiut:
3
1 2 3

Sample Output:
3
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int removeK(int[] arr,int n)
    {
        int ans=0;
        int i=0;
        
        while(i<n)
        {

            int j=i+1;
            while(j<n&& arr[i]==arr[j])
            {
                j++;
            }
            if((j-i)>2)
            {
                ans+=((j-i)-2);
            } 
            i=j;
        }
        return n-ans;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        
        System.out.println(removeK(arr,n));
    }
}