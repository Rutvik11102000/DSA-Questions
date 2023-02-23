/*
 * GCD Subarray Game
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Find if there is any subarray in the array whose GCD is equal to 1.
Input
The first line of the input contains a single integer N.
The second line contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if there is any subarray in the array whose GCD is equal to 1, else print "NO", without the quotes.
Example
Sample Input:
5
6 2 5 3 1

Sample Output:
YES

 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed 
//By Anand
class Main {
    public static int findGcd(int a,int b){
        if(a==0){
            return b;
        }
        return findGcd(b%a,a);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=arr[0];
        for(int i=0;i<n;i++){
            result=findGcd(result,arr[i]);
        }
        if(result==1){
                System.out.println("YES");
            }else{
                 System.out.println("NO");
            }
    }
}