/*
 * Bad Dish (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob ate a bad dish today which left K units of bad taste in his mouth. To counter this bad taste, he decided to buy some chocolates. There are infinite types of chocolates. The chocolate of the Mth type cost M cents and gives M units of good taste. When Bob eats a chocolate at time T, he get 1 unit of good taste per second during the next M seconds . The maximum amount of good taste Bob can get in a second is 1 unit .
For example: If Bob ate two chocolates at T= 1 and T= 2 seconds and M = 2, he gets 1 unit of good taste for each T=1, 2, 3.
The number of chocolates he can have is fixed to N and he can have the ith chocolate at T=A[i] seconds. Bob wants to know the minimum amount of money he needs to spend to get rid of all bad taste. 1 unit of bad taste is removed by 1 unit of good taste and Bob can have any amount of residual good taste left in his mouth.
Input
First line contains a single integer T — the number of test cases.
First line of each test case contains two integers N and K — the number of chocolates and the units of bad taste.
Second line of each test case contains N integers - denoting the time you had the ith chocolate.

Constraints
1 <= T <= 1000
1 <= N <= 100
1 <= K <= 10^18
1 <= A[i] <=10^9
A[i] < A[i+1]
Output
Print a single integer - the minimum amount Bob needs to spend.
Example
Sample Input 1:
1
2 5
1 5

Output
3

Explanation:
If M=3, then Bob gets good taste at T = [1, 2, 3, 5, 6, 7]
This is 6 units of good taste. So, he successfully countered his bad taste and this is the minimum M possible.

Sample Input 2:
2
3 10
2 4 10
4 1000
3 25 64 1337

Output
4
470

Explanation
If M=4, then Bob gets good taste at T = [2, 3, 4, 5, 6, 7, 10, 11, 12, 13]
This is 10 units of good taste. So, he successfully countered his bad taste and this is the minimum M possible.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.io.*;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)  throws IOException{
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t>0){
            int N;
            long h;
            String line = br.readLine();
            String[] str = line.trim().split("\\s+");
            N = Integer.parseInt(str[0]);
            h = Long.parseLong(str[1]);
            long a[] = new long[N];
            line = br.readLine();
            str = line.trim().split("\\s+");
            for(int i =0;i<N;i++){
                a[i] = Long.parseLong(str[i]);
            }
            long ng = 0;
            long ok=h;
            while(ok-ng>1){
                long x =(ok+ng)/2;
                long sum =0;
                for(int n=0;n<N;n++){
                    if(n==N-1){
                        sum +=x;
                    }else{
                        sum += Math.min(x,a[n+1]-a[n]);
                    }
                }
                if(sum>=h){
                    ok =x;
                }else{
                    ng = x;
                }
            }
            System.out.print(ok+"\n");
            t--;
        }
    }
}