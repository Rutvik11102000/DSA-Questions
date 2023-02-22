/*
 * Number of Merge
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an unsorted array of length n and must sort it using merge sort while also printing the amount of merges that occur throughout the sorting process.
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0<= n <=100000
Output
First- line should be the sorted array and the second should be the number of mergers that occurs when the array is sorted using merge sort.
Example
Sample Input:
5
5 1 2 7 3

Output:
1 2 3 5 7
4
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
         // conquer process
    static long count = 0;  
    public static void conquer(int arr[], int si,int mid, int ei){
        count++;
        int merged[] = new int[ei - si + 1];
        int index1 = si;    
        int index2 = mid+1;          
        int x = 0;      
        while(index1 <= mid && index2 <= ei){ 
            if(arr[index1] <= arr[index2]){      
                merged[x++] = arr[index1++];        
            }else{                     
                merged[x++] = arr[index2++]; 
                }         
        }           
            while(index1 <= mid){      
                merged[x++] = arr[index1++];   
            }         
            while(index2 <= ei){       
                merged[x++] = arr[index2++];    
            }        
            for(int i=0, j=si; i<merged.length; i++ , j++){  
                arr[j] = merged[i];
            }  
    }       
              // divide process   
    public static void divide(int arr[], int si, int ei){
        if(si >= ei ){
            return;
        }
            int mid = si + (ei-si)/2;
            divide(arr , si, mid);
            divide(arr , mid+1 , ei);
            conquer(arr, si, mid, ei);    
    }       
                // main function
    public static void main(String [] args){
                // user input
                Scanner sc = new Scanner(System.in);   
                int n = sc.nextInt();     
                int arr[] = new int[n];  
                for(int i=0; i<n; i++){  
                    arr[i] = sc.nextInt();
                } 
                    divide(arr, 0, n-1);
                   // divide into two arrays  
                   // print       
                    for(int i=0; i<n; i++){        
                       System.out.print(arr[i] +" ");
                    }     
                      System.out.println();     
                      System.out.println(count);   
    }
}