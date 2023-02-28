/*
 * Max XOR
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of non- negative integers of size N. The task is to find the maximum possible xor between two numbers present in the array.
Input
First line of input contains integer N (length of array). Next line contains N space separated integers which are numbers of array.

Constraints
2 <= N <= 100000
1 <= Arr[i] <= 10^9
Output
Print the the maximum possible xor between two numbers present in the array.
Example
Sample Input
6
25 10 2 8 5 3

Sample Output
28

Explanation
5^25=28
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int max_Xor(int arr[],int n){
        int maxx=0,mask=0;
        HashSet<Integer> se=new HashSet<>();
        for(int i=30;i>=0;i--){
            mask |=(1<< i);
            for(int j=0;j<n;++j){
                se.add(arr[j] & mask);
            }
            int newMaxx=maxx | (1<<i);
            for(int prefix :se){
                if(se.contains(newMaxx ^ prefix)){
                    maxx =newMaxx;
                    break;
                }
            }
            se.clear();

        }
        return maxx;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(max_Xor(arr,N));

    }
}