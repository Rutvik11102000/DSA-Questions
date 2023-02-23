/*
 * 
 * Good circular array
easy
Problem Statement
A circular array is called good if, for every index i (0 to N-1), there exists an index j such that i != j and sum of all the numbers in the clockwise direction from i to j is equal to the sum of all numbers in the anticlockwise direction from i to j.
You are given an circular array of size N, Your task is to check whether the given array is good or not.
Input
First line of input contains a single integer N, the next line of input contains N space separated integes depicting values of the array.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 1000000
Output
Print "Yes" if array is good else print "No"
Example
Sample Input:-
4
1 4 1 4

Sample Output:-
Yes

Explanation:-
for index 1, j will be 3, then sum of elements from index 1 to 3 in clockwise direction will be 1 + 4 + 1 = 6 and the sum of elements from index 1 to 3 in anticlockwise direction will be 1 + 4 + 1 = 6.
For index 2, j will be 4
For index 3, j will be 1
For index 4, j will be 2

Sample Input:-
4
1 2 3 4

Sample Output:-
No

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
        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        boolean good = true;
        if(n%2==1){
            System.out.println("No");
        }
        else{
            for(int i =0; i<n/2; i++){
                if(arr[i] !=arr[i+n/2]){
                    good=false;
                    break;
                }
            }
            if(good) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}