/*
 * Missing two
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array in which all numbers except two are repeated once. (i. e. we have 2N+2 numbers and N numbers are occurring twice and remaining two have occurred once). Find those two numbers.
Input
First line of input contains a single integer N. The next line of input contains 2*N+2 space separated integers.

Constraints:-
1 < = N < = 10000
1 < = Arr[i] < = 100000000
Output
Print the two elements separated by space (print the lower element first).
Example
Sample Input:-
2
1 3 4 1 5 3

Sample Output:-
4 5

Sample Input:-
3
1 2 3 5 4 3 2 1

Sample Output:-
4 5
 */


 import java.io.*; // for handling input/output
 import java.util.*; // contains Collections framework
 
 // don't change the name of this class
 // you can add inner classes if needed
 public class Main {
     public static void main (String[] args) {
         // Your code here
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr= new int[2*n+2];
         for(int i=0; i<2*n+2;i++){
             arr[i]=sc.nextInt();
         }
         int xor=0;
         for(int num:arr){
             xor ^=num;
         }
         int setBit=xor & (~xor+1);
         int x=0;
         int y=0;
         for(int num: arr){
             if((num & setBit) != 0){
                 x ^=num;
             }else{
                 y ^= num;
 
             }
         }
         System.out.println(Math.min(x,y)+" "+Math.max(x,y));
     }
 }
