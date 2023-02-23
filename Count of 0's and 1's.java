/*
 * Count of 0's and 1's
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary array of size N. Count number of 1's and 0's in the array.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
1 <= N <= 105
0 <= arr[i] <= 1
Output
Print two integers, count of 1s and count of 0s.
Example
Input:
5
0 1 1 0 1

Output:
3 2
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int Zero=0;
     int One=0;
    for(int i=0;i<n;i++){
       if(sc.nextInt()==0){
           Zero++;
       }else{
           One++;
       }
    }
    System.out.println(One+" "+Zero);
    }
}