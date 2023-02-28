/*
 * Power function
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Implement pow(X, N), which calculates x raised to the power N i.e. (X^N).
Try using a recursive approach
Input
The first line contains T, denoting the number of test cases. Each test case contains a single line containing X, and N.

Constraints:
1 ≤ T ≤ 100
-10.00 ≤ X ≤10.00
-10 ≤ N ≤ 10
Output
For each test case, you need to print the value of X^N. Print up to two places of decimal.

Note:
Please take care that the output can be very large but it will not exceed double the data type value.
Example
Input:
1
2.00 -2

Output:
0.25

Explanation:
2^(-2) = 1/2^2 = 1/4 = 0.25
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static double pow(double X, int N){
        if(N==0) return 1;
        if(N<0){
            X=1/X;
            N=-N;

        }
        double result=1;
        while(N>0){
            if(N%2 == 1) result *= X;
            X *= X;
            N /=2;
        }
        return result;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-- >0){
            double X=sc.nextDouble();
            int N=sc.nextInt();
        
        double result=pow(X, N);
        System.out.printf("%.2f\n", result);
    }
    }
}