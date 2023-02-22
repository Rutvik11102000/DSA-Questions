/*
 * 
 * Merge array
easy
asked in interviews by 6 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two sorted array your task is to merge these two arrays into a single array such that the merged array is also sorted
Input
First line contain two integers N and M the size of arrays
Second line contains N separated integers the elements of first array
Third line contains M separated integers elements of second array

Constraints:-
1<=N,M<=104
1<=arr1[], arr2[] <=105
Output
Output the merged array
Example
Sample Input:-
3 4
1 4 7
1 3 3 9

Sample Output:-
1 1 3 3 4 7 9
 */




 import java.util.*;
import java.io.*;
class Solution{
   public static void merge(long arr1[], long arr2[], int n, int m) 
   {
         int i=0, j=0, k = n-1;
         while(i <= k && j < m){
             if(arr1[i] < arr2[j]){
                 i++;
             }
             else{
                 long temp = arr2[j];
                 arr2[j] = arr1[k];
                 arr1[k] = temp;
                 j++;
                 k--;
                 
             }
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
   }
}
public class Main{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
	}
}