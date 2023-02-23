/*
 * Index sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array a of n integers. Find the maximum value of (i + j) such that 1 ≤ i < j ≤ n and a[i] = a[j].
Input
The First line of the input contains n.
The next line contains n space-separated integers.

Constraints
1 ≤ n ≤ 105
1 ≤ a[i] ≤ n
Output
Output a single integer denoting maximum sum.
Example
Input:
6
2 3 1 2 3 5

Output:
7

Explanation:
for 2 => i = 1, j = 4 => i+j = 5
for 3 => i = 2, j = 5 => i+j = 7
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    HashMap<Integer,Integer>hm=new HashMap<>();
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        if(hm.containsKey(a)){
        max=Math.max(max,i+hm.get(a)+2);
        hm.remove(a);
        hm.put(a,i);
        }else{
            hm.put(a,i);
        }
    }
    System.out.println(max);
    }
}