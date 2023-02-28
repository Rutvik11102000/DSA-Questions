/*
 * Score bar
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You take part in N quizzes and in the ith quiz you get a score of Qi. Your friends are very competitive with you and they ask you the strength of your quiz scores. Strength of an array is defined as the following:

The maximum growth Qj - Qi (Qj > Qi) between two quizzes i and j such that i < j and there is no quiz k such that i < k < j and Qk > Qi.
If there is no such pair of indexes, print -1.

Print the strength of your quiz marks in order to impress your friends.
Input
First line contains a single integer N, the number of quizzes.
The second line contains N space seperated integers Q1, Q2,. , QN the score in each quiz.

Constraints:
1 <= N <= 105
1 <= Qi <= 109
Output
Print the strength of your quiz marks.
Example
Sample Input:
6
7 10 7 2 1 8

Sample Output:
7

Explaination:
There is a growth of 7 from Q5 (= 1) to Q6(= 8). There is no growth in the array greater than this.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int curr=arr[0];
        int count=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>curr){
                int diff=arr[i]-curr;
                max=Math.max(max,diff);
                curr=arr[i];

            }else{
                curr=arr[i];

            }
        }

        System.out.print(max);
    }
}