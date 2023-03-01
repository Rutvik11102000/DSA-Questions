/*
 * Increasing Frequency Sort
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
Input
The first line of the input contains n ( length of num )
The second line contains the array num.

Constraints
1 ≤ nums. length ≤ 100
-100 ≤ nums[i] ≤ 100
Output
Print the sorted array
Example
Sample Input
6
1 1 2 2 2 3

Sample Output
3 1 1 2 2 2

Explanation: '
3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
 */

 import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] str1 = str.split(" ");
        int[] arr = new int[n];
         HashMap<Integer,Integer> map = new HashMap<>();
         List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        arr = frequencySort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
	}
    static Map<Integer,Integer>map;
    public static int[] frequencySort(int[] nums)
    {
        map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,1+map.get(i));
            }else{
                map.put(i,1);
            }
        }
        Integer[]arr=new Integer[nums.length];
        int k=0;
        for(int i:nums){
            arr[k++]=i;
        }
        Arrays.sort(arr,new Comp());
        k=0;
        for(int i:arr){
            nums[k++]=i;
        }
        return nums;
    }
}
class Comp implements Comparator<Integer>{
    Map<Integer,Integer>map=Main.map;
    public int compare(Integer a,Integer b){
        if(map.get(a)>map.get(b))return 1;
        else if(map.get(b)>map.get(a))return -1;
        else{
            if(a>b)return -1;
            else if(a<b)return 1;
            return 0;
        }
    }
}