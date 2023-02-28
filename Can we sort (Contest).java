/*
 * Can we sort? (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob was working on a new algorithm to make an array non-decreasing. he came up with the following algorithm :

For an array a of size n
Step 1: Select two indexes i and j, 0 ≤ i < j < n.
Step 2: if a[i] + a[j] is odd then do a[i] = a[j]
if a[i] + a[j] is even then do a[j] = a[i]
Step 3: Repeat steps 1 and 2 until the array is non-decreasing.

Bob is not sure about his algorithm, he asks you if it is possible to make the given array non-decreasing using the mentioned algorithm.
Input
The first line contains n.
The next line contains n space-separated integers.

Constraints
1 ≤ n ≤ 105
1 ≤ a[i] ≤ 109
Output
Print "YES" of it is possible to make array non- decreasing, otherwise print "NO".
Example
Input:
4
3 2 5 3

Output:
YES

Explanation:
(i, j) => (0, 1) => 3+2 = 5 => odd => a[0] = a[1] => a[0] = 2
(i, j) => (2, 3) => 5+3 = 8 => even=> a[3]= a[2] => a[3] = 5
final aray => 2 2 5 5
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        int a=0;
        int b=a+1;
        while(b<n && a<b){
            if(arr[b]<arr[a]){
                if((arr[a]+arr[b])%2==0){
                    arr[b]=arr[b];
                }
                else{
                    arr[a]=arr[b];
                }
            a=a+2;
            b=b+2;
            }
            else{
                a++;
                b++;
            }
            
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print("YES");
                return ;
            }
        }
        System.out.print("YES");
        
    }
}