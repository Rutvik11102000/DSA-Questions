/*
 * Digits Rearrangement (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a positive integer N, Akash wants you to determine if it is possible to rearrange the digits of N (in decimal representation) and obtain a multiple of 5.
Input
The first line of the input contains an integer T, denoting the number of test cases.
Each test case consists of two lines
The first line contains a single integer D, the number of digits in N.
The second line consists of a string of length D, the number N.

Constraints
1 ≤ T ≤ 1000
1 ≤ D ≤ 1000
1 ≤ N &le 101000
Sum of D over all test cases ≤ 1000.
Output
For each test case, print Yes if it is possible to rearrange the digits of N so that it becomes a multiple 5. Otherwise, print No.
Example
Sample Input
3
3
115
3
103
3
119
Sample Output
Yes
Yes
No
 */




 // Digits Rearrangement (Contest)

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int ti=0; ti<t; ti++){
            
            int n = sc.nextInt();
            sc.nextLine();

            String str  = sc.nextLine();

            boolean isDivisible = false;

            for(int i=0; i<n; i++){
                char ch = str.charAt(i);
                if(ch == '0' || ch == '5'){
                    isDivisible = true;
                    break;
                }
            }

            if(isDivisible){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}