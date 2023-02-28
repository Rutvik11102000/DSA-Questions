/*
 * Candy Love (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A shop sells candies of sweetness ranging from 1 to 1000000000. Price of a candy with sweetness X is A*X + B*f(X) units, where f(X) returns number of digits in the decimal notation of X. Given A, B, and T, find the candy with maximum sweetness that Andy can buy if he has T units of money. If he cannot buy any candy, print 0.
Input
The first and the only line of input contains three integers A, B and T.

Constraints:
1 <= A, B <= 10^9
1 <= T <= 10^18
Output
Print the maximum sweetness that Andy can buy if he has T units of money. If he cannot buy any candy, print 0.
Example
Sample Input 1
10 7 100

Sample Output 1
9

Explanation: Cost of 9 level candy = 9*10 + 7*f(9) = 9*10 + 7*1 = 97.

Sample Input 2
1000000000 1000000000 100

Sample Output 2
0

 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int digitCount(long num){
         int count =0;
         while(num>0){
             count++;
             num=num/10;
         }
         return count;
     }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new  Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long t = sc.nextLong();
        long ans=-1;
        long start=0;
        long end=1000000000L;
        while(start<=end){
            long mid=start+(end-start)/2;
            long x=mid;
            long curr=(a*x)+(b*digitCount(x));
            if(curr<=t){
                ans=x;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}