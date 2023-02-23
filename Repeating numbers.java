/*
 * Repeating numbers
medium
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are two arrays nums1 and nums2 are given as input having n and m elements respectively. print all distinct common elements in arrays in sorted order.
Input
There are two integers n and m are given in first line as input.
In Second line n space separated integers of array nums1 are given.
In Third line m space separated integers of array nums2 are given.

Constraints
1 <= n, m <= 103
0 <= nums1[i], nums2[i] <= 109
Output
Print all distinct common elements in arrays.
Example
Sample Input:
3 5
1 2 4
2 4 5 6 7

Sample Output:
2 4

 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    TreeSet<Integer>hs=new TreeSet<>();
    TreeSet<Integer>h=new TreeSet<>();
    for(int i=0;i<n;i++){
        hs.add(sc.nextInt());
    }
    for(int i=0;i<m;i++){
        int a=sc.nextInt();
        if(hs.contains(a)){
           h.add(a);
        }
    }
    for(Integer hm:h){
        System.out.print(hm+" ");
    }
    }
}