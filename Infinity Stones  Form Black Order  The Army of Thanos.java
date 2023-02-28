/*
 * Infinity Stones : Form Black Order - The Army of Thanos
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N aliens standing in a straight line, each with a unique strength ( integer value ).
Your task is to choose 3 aliens as the leaders of the entire army under the following rules :
a. Choose 3 aliens with index (i, j, k ) with strengths ( trength[i], strength[j], strength[k] ).
b. The team is valid if strength[i] < strength[j] < strength[k] OR strength[i] > strength[j] > strength[k]
where 0 <= i < j < k < N
Print the numbers of valid teams that can be formed.
Input
The first line contains an integer N, denoting the number of aliens
The Second line contains N space- separated integers denoting the strengths of the aliens.

Constraints:-
3 <= N <= 1000
0 <= strength[i] <= 10^5
All integers in the strength are unique
Output
Print the numbers of valid teams that can be formed.
Example
Sample Input:-
4
1 2 3 4

Sample Output:-
4

Explanation:-
The possible teams are:- (1, 2, 3), (1, 2, 4), (1, 3, 4), (2, 3, 4)

Sample Input:-
3
2 3 1

Sample Output:-
0
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
        int[] arr = new int[n];

        for(int i = 0; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0; 
        for(int i = 0; i<n-2 ; i++){
            for(int j = i+1; j<n-1 ; j++){
                for(int k = j+1 ; k<n ;k++){
                    if((arr[i]<arr[j] && arr[j] < arr[k]) || (arr[i]>arr[j] && arr[j] > arr[k])){
                        count++;
                    }
                }
            }
        }

       System.out.print(count);
    }
}