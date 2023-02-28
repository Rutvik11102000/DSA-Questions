/*
 * Kth occurence
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, an integer X, and Q queries. For each query, you will be given an integer K. Your task is to find the Kth occurrence of the number X in the array. If the Kth occurrence does not exist print -1.
Input
The first line of input contains three integers N, X, and Q. The second line of input contains N space- separated integers. The Next Q lines of input contain a single integer each representing K.

Constraints:-
1 <= Q, K, N <= 100000
1 <= X, Arr[] <= 100000
Output
For each query in a new line print the index of the Kth occurrence. If the Kth occurrence does not exist print -1.
Example
Sample Input:-
10 3 4
1 2 3 4 2 3 4 5 2 3
1
2
3
4

Sample Output:_
3
6
10
-1
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == x){
                list.add(i+1);
            }
        }

        for(int i = 0; i < q ; i++){
            int z = sc.nextInt();
            if(z <= list.size()){
                System.out.println(list.get(z-1));
            } else{
                System.out.println(-1);
            }
        }
    }
}