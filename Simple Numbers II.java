/*
 * Simple Numbers II
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Saloni has n numbers and she wants to create groups using those numbers. The size of the group can be one or two and the sum of numbers in the group cannot exceed x.

Help Saloni find the minimum number of groups she can make.
Input
The first input line contains two integers n and x: the count of numbers and the maximum allowed sum.
The next line contains n integers p[1],p[2],…,p[n]: the value of the numbers.

Constraints
1 <= n <= 200000
1 <= x, p[i] <= 1000000000
p[i] <= x for all i
Output
Print one integer the minimum number of groups.
Example
Sample Input
4 10
7 2 3 9

Sample Output
3

Explanation
Possible Groups: (2, 3), (3, 7), (2, 7)

Sample Input:
4 10
7 8 9 10

Sample Output:
4
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    int i =0 , count = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] arr = new int[n];
    for(i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    i=0;
    int j = n-1;
    while(i<j)
    {
        if(arr[i] + arr[j] <= x)
        {
            count++;
            i++;
            j--;
        }
        else
        {
            
            j--;
        }
    }
   
   if(count == 0 || count > n)
   {
        System.out.print(n);
   }
   else{
       System.out.print(n - count);
   }
    }
}