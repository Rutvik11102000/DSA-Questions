/*
 * Right Rotation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array a, you must perform one right rotation on an array of n integers. In one right rotation, all elements will move one index to the right in a circular motion.
Print the array's n space-separated integers after the right rotation.
Input
The first line contains n.
The next line contains n space-separated integers.

constraints
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 109
Output
Print n space-separated integers of the array after the right rotation.
Example
Sample Input:
5
1 2 3 4 5

Sample Output:
5 1 2 3 4
 */





 // import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework

// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
//     public static void main (String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }
//     int x=arr[0];
//     int k=0;
//     int newArray[]=new int[n];
//     for(int i=1;i<n;i++){
//      newArray[k++]=arr[i];
//     }
//     newArray[n-1]=x;
//      for(int i=0;i<n;i++){
//         System.out.print(newArray[i]+" ");
//     }
//     }
// }
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform one right rotation on the array
        int temp = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        // Print the resulting array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}