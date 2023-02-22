/*
 * max. complement
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have given an array A of even length. Print the maximum possible product of any number and their complement.
The first element is the complement of the last element, the second element is the complement of the second last, and so on.
Solve the given problem in O(n).
Input
First line contain a integer N.
Next line contain N space integer A[i].

Constraints
1<=N<=10^5
1<=A[i]<=10^9
Output
Print the maximum possible product.
Example
Sample Input 1:
8
1 3 4 2 3 4 8 6

Sample Output 1:
24

Sample Input 2:
6
1 2 3 4 5 6

Sample Output 2:
12
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    int i,j;
    int max = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    for(i = 0;i<N;i++)
    {
        arr[i] = sc.nextInt();
    }
    i = 0;
    j = N-1;
   // int max = 0;
   while(i < j)
   {
    if(arr[i] * arr[j] > max)
    {
        max = arr[i] * arr[j];
        i++;
        j--;
    }
    else
    {
        i++;
        j--;
    }   
   }
     System.out.print(max);
    }
}