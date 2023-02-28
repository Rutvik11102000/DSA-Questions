/*
 * Integer Modification (contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You care given an array A having N integers. Find the minimum number of integers you would have to modify from the array so that there are at most K distinct integers in the array.
Input
The first line of the input contains two integers, N and K.
The second line of the input contains N space seperated integers.

Constraints:
1 <= K <= N <= 105
1 <= Ai <= N
Output
Print the minimum number of integers you would have to modify from the array so that there are at most K distinct integers in the array.
Example
Sample Input
5 2
1 1 2 2 6

Sample Output:
1
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[n];
        int ans = 0;
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            if(mp.containsKey(a[i])){
                mp.put(a[i],mp.get(a[i])+1);
            }else{
                mp.put(a[i],1);
            }
        }
        List<Integer>res = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
            res.add(entry.getValue());
        }
        Collections.sort(res,Collections.reverseOrder());
         while(res.size() > k){
             ans += res.get(res.size()-1);
             res.remove(res.size()-1);
         }
         System.out.println(ans);
    }
}