/*
 * Search in rotated sorted array
easy
asked in interviews by 3 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have an array sorted in non- decreasing order and an element key. You have to find whether the key is present inside your array or not.
Input
The first line contains a single element N(size of our array)
The next line contains N space- separated integer A[i].
The next line contains a single integer key.
Output
Determine whether the key is present in our array or not.
Example
Sample Input 1:
8
5 6 7 8 1 2 3 4
7

Sample Output 1:
1

Explanation:
7 present at 3rd index.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static int search(long[] nums, long target) {
        
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return 1;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid] ){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return 0;
    }
    

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        System.out.print(search(arr,k));
        
    }
}