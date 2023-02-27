/*
 * Least Subarrays
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Find the least subarray size K required from two arrays A and B (their positions don't matter), so that the product of the sum of those two subarrays is at least S. If no answer exists, print -1.
Input
The first line contains the integer T(the number of test cases).
Each test case contains 4 lines-
The first line contains 2 integers N and M (the respective sizes of the array)
The next line contains N integers (elements of the first array)
The next line contains M integers (elements of the second array)
The next line contain the integer S

Constraints:
1 <= T <= 10
1 <= N, M <= 105
1 <= Ai <= 10^4
1 <= Bi <= 10^4
1 <= S <= 1016
Output
Print the required minimum size K if a solution exists else print -1.
Print answers for each test case in a new line.
Example
Sample Input:
1
5 6
1 2 3 4 6
2 4 5 4 9 3
120

Sample Output:
2

Explanation:
We can choose a subarray [4, 6] of size 2 from A.
We can choose a subarray [4, 9] of size 2 from B.
Now sum from array A = 4+6 = 10
Sun from array B = 4+9 = 13
Product = 10 * 13 = 130 (which is greater than S)
It can be shown that jo subarray of size 1 can give appropriate results.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] nums;
        while(t-->0){
            nums=sc.nextLine().split(" ");
            int n = Integer.parseInt(nums[0]);
            int m = Integer.parseInt(nums[1]);

            nums = sc.nextLine().split(" ");
            int[] arr1 =new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=Integer.parseInt(nums[i]);

            }
            nums = sc.nextLine().split(" ");
            int[] arr2 = new int[m];
            for(int i=0;i<m;i++){
                arr2[i]= Integer.parseInt(nums[i]);
            }
            long s = Long.parseLong(sc.nextLine());
            int len =Math.min(n,m);
            int ans  = -1;
            int l =0, r =len;
            while(l<=r){
                int k= (l+r)/2;
                long sum1=0,sum =0;
                for(int j=0;j<n;j++){
                    sum=sum+arr1[j];
                    if(j>=k) sum = sum-arr1[j-k];
                    sum1=Math.max(sum1,sum);
                }
                sum=0;
                long sum2 =0;
                for(int j=0;j<m;j++){
                    sum=sum+arr2[j];
                    if(j>=k) sum = sum- arr2[j-k];
                    sum2=Math.max(sum2,sum);
                }
                if(sum1*sum2>=s){
                    ans=k;
                    r=k-1;
                }else{
                    l=k+1;
                }
            }
            System.out.println(ans);
        }
    }
}