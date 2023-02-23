/*
 * Derrangement Exercise (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. In one move, you can swap any two elements of this array. Find out whether you can make this array strictly increasing or not after any (possibly 0) number of moves.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 106
Output
Print "YES", if you can make the array strictly increasing, else print "NO", without the quotes.
Example
Sample Input:
5
5 9 4 5 3

Sample Output:
NO

Explaination:
After any number of moves, you cannot make this array strictly increasing.
 */





 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap <Integer, Integer> hm = new HashMap <>();
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(!hm.containsKey(arr[i]))
              hm.put(arr[i],1);
            else{
                int index = hm.get(arr[i]);
                hm.put(arr[i],index+1);
                flag = true;
            }  
        }
            if(flag){
                System.out.print("NO");
            }else{
                System.out.print("YES");
            }
        
    }
}