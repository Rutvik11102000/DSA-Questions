Arpit's toy (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Arpit Gupta has brought a toy for his valentine. She is playing with that toy which runs for T seconds when winded.If winded when the toy is already running, from that moment it will run for T seconds (not additional T seconds) For example if T is 10 and toy has run for 5 seconds and winded at this moment then in total it will run for 15 seconds.
Arpit's Valentine winds the toy N times.She winds the toy at t[i] seconds after the first time she winds it.How long will the toy run in total?
Input
First Line of input contains two integers N and T
Second Line of input contains N integers, list of time Arpit's Valentine has wound the toy at.

Constraints
1 <= N <= 100000
1 <= T <= 1000000000
1 <= t[i] <= 1000000000
t[0] = 0
Output
Print a single integer the total time the toy has run.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        long sum =0;
        for(int i=0; i<n-1; i++){
            
           long temp =  arr[i+1]-arr[i];
           if(temp>t){
               sum +=t;
           }else{
               sum +=temp;
           }
        }
        System.out.println(sum+t);
    }
}
