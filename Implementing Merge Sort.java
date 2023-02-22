/*
 * Implementing Merge Sort
easy
asked in interviews by 33 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array, your task is to sort the array using merge sort.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function implementMergeSort() that takes 3 arguments.
arr: input array
start: starting index which is 0
end: ending index of array

Constraints
1 <= T <= 100
1 <= N <= 106
0 <= Arr[i] <= 109

Sum of 'N' over all test cases does not exceed 106
Output
You need to return the sorted array. The driver code will print the array in sorted form.
Example
Sample Input:
2
3
3 1 2
3
4 5 6

Sample Output:
1 2 3
4 5 6
 */



 public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose 
      devide(arr, start, end);
      return arr; 
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int[] merged= new int[end-start+1];
        int indx1= start;
        int indx2= mid+1;
        int x =0;
        while(indx1<=mid && indx2<=end){
            if(arr[indx1]<=arr[indx2]){
                merged[x++]=arr[indx1++];
                
            } else{
                merged[x++] = arr[indx2++];
                
            }
          
        }
        while(indx1<=mid){
            merged[x++]= arr[indx1++];
            
        }
        while(indx2<=end){
            merged[x++]=arr[indx2++];
            
        }
        for(int i=0, j=start; i<merged.length; i++, j++ ){
            arr[j]= merged[i];
        }
    }
    public static void devide(int [] arr, int start, int end){
        if(start>=end){
            return;
        } 
        int mid= start+(end-start)/2;
        devide(arr, start, mid);
        devide(arr, mid+1, end);
        merge(arr, start, mid, end);
    }           