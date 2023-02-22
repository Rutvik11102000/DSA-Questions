/*
 * Same Pair (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N integers. Solve the following problem for X from 1 to N :-
Find the number of ways to select a pair (i, j) such that i < j and i != X and j != X and Arr[i] = Arr[j].
Input
First line of input contains a single integer, N.
Second line of input contains N space separated integers, denoting array Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= N
Output
Print N space separated integers where ith integer is the answer when X = i.
Example
Sample Input
5
4 4 1 1 1

Sample Output
3 3 2 2 2

Explanation:
For X=1 we have (3, 4) (3, 5) (4, 5)
For X=2 we have (3, 4) (3, 5) (4, 5)
For X=3 we have (1, 2) (4, 5)
For X=4 we have (1, 2) (3, 5)
For X=5 we have (1, 2) (3, 4)
 */





 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner in =  new Scanner(System.in);
        int N = in.nextInt();
        ArrayList <Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            nums.add(in.nextInt());
        }
        in.close();
        solve(nums,N);
    }
    private static void solve(ArrayList<Integer>nums,int N){
        Map<Integer,Integer> freq = new TreeMap<Integer,Integer>();

     for(int i=0;i<N;i++){
         int key = nums.get(i);
         if(freq.containsKey(key)==false){
             freq.put(key,1);
         }
         else{
             int val = freq.get(key);
             freq.put(key,val+1);
         }
     }
     int all =0;
     for(Integer key:freq.keySet()){
         int val = freq.get(key);
         all+=val*(val-1)/2;
     }
     int result =0;
     for(int i=0;i<N;i++){
         result= all-freq.get(nums.get(i))+1;
         System.out.print(result+" ");
     }
     System.out.println();
    }
}