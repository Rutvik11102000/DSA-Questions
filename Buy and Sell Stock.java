/*
 * Buy and Sell Stock
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Print the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Input
First line contains n, denoting the number of days for transaction.
Next line contains n space separated integers denoting price on each day.

Constraints
1 <= n <= 105
0 <= prices[i] <= 109
Output
A single integer denoting the maximum profit.
Example
Input:
6
7 1 5 3 6 4

Output:
5

Explanation :
buy on 2nd day and sell on 5th day.
profit = sell - buy = 6 - 1 = 5
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int minPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<n;i++){
        minPrice=Math.min(minPrice,arr[i]);
        maxProfit=Math.max(maxProfit,arr[i]-minPrice);
    }
    System.out.println(maxProfit);
    }
}