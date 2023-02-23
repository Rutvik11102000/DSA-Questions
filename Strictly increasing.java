/*
 * Strictly increasing
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer array a of size N. Find out if by rearranging the elements, you can make the array strictly increasing. In other words, determine if it is possible to rearrange the elements such that a1 < a2 < ⋯ < a n holds.

You must solve this problem in O(N) time complexity.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
1 <= n <= 105
1 <= a[i] <= 105
Output
Print "YES" or "NO".
Example
Input:
5
2 1 90 2 4

Output:
NO

 */








 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        if(hs.contains(a)){
            System.out.println("NO");
            return;
        }else{
            hs.add(a);
        }
    }
    System.out.println("YES");
    }
}