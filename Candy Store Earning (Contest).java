Candy Store Earnings (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tom goes to a candy store. There are N types of candies in that store and the price of the ith type of candy is Ai. These prices can be negative also which basically mean the candies have expired and the owner is giving you money to take those candies home. Find the maximum amount of money Tom can earn in the shop if he can buy at most K types of candies.
Input
The first line of the input contains two integers N and K.
The second line contains N space seperated integers.

Constraints:
1 <= K <= N <= 105
-109 <= Ai <= 109
Output
Print the maximum amount of money Tom can earn in the shop.
Example
Sample Input:
5 3
-6 0 3 -1 4

Sample Output:
7


// solution //

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] candies = new long[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextLong();
        }
        
        Arrays.sort(candies);
        long sum = 0;
        for (int i = 0; i < k; i++) {
            if (candies[i] < 0) {
                sum += Math.abs(candies[i]);
            }
        }
        System.out.println(sum);
    }
}
