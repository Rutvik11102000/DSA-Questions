/*
 * Teacher
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom is a teacher responsible for a class of N students. The students are given distinct student numbers from 1 to N.
Today, all the students entered the classroom at different times. According to Tom's record, there were Ai students in the classroom when student number i entered the classroom (including student number i).
From these records, reconstruct the order in which the students entered the classroom.
Input
Input is given from Standard Input in the following format:
First line contains a single integer N the array length and the second line contains elements of the array

Constraints
1 ≤ N ≤ 10000
1 ≤ Ai ≤ N
Ai ≠ Aj if (i≠j)
Output
Print the student numbers of the students in the order the students entered the classroom.
Example
Sample Input
3
2 3 1

Sample Output
3 1 2

Explanation:-
First, student number 3 entered the classroom.
Then, student number 1 entered the classroom.
Finally, student number 2 entered the classroom.

Sample Input:
5
5 4 3 2 1

Sample Output:
5 4 3 2 1

 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main { 
 public static void main (String[] args) { 
 // Your code here
 Scanner sc=new Scanner(System.in); 
 int N=sc.nextInt(); 
 int arr2[]=new int[N]; 
 int arr[]=new int[N]; 
 for(int i=0;i<N;i++){ 
 arr[i]=sc.nextInt(); 
 } 
 for(int i=0;i<N;i++){ 
 arr2[arr[i]-1]=i+1; 
 } 
 for(int i=0;i<N;i++){ 
 System.out.print(arr2[i]+" "); 
 } 
 } 
}