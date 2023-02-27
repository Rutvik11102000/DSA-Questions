/*
 * 
 * Science Camp (contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N students in the science camp. The ith of those students has an intelligence of di. The instructor wants to group each student into a pair 2 wherein each student is present in exactly one group and each group has exactly 2 students in it. Furthermore, he wants the sum of intelligence in each group to be the same. The efficiency of a group having students i and j are defined as di*dj. Find the sum of the efficiencies of all the groups in the science camp.
If such a distribution is not possible, print -1.
Input
The first line of the input contains a single integer N.
The second line contains N space-separated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 106
It is given that N is always even.
Output
Print the sum of the efficiencies of all the groups in the science camp.
If a legit distribution of students is not possible, print -1.
Example
Sample Input1:
6
4 5 3 6 1 2

Sample Output1:
28

Sample Input2:
4
5 3 9 6

Sample Output2:
-1

Explaination1:
We can divide groups of students like:
[3, 4] Efficiency = 3*4 = 12
[2, 5] Efficiency = 2*5 = 10
[1, 6] Efficiency = 1*6 = 6
Total efficiency = 12 + 10 + 6 = 28
 */




 import java.io.InputStreamReader;

import static java.lang.Math.*;
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
      public static void main(String[] args) {
        FastReader sc = new FastReader(new BufferedInputStream(in));
        int times = 1;
        while (times-- >0){
            solve(sc);
        }
    }
    public static void solve(FastReader sc) {
        int n = sc.nextInt();
        long[] arr = new  long[n];
        for (int i = 0; i < n; i++) {
         arr[i] = sc.nextLong();
        }
        sort(arr);
        int i = 0;
        int j = n-1;
        long ans = arr[i]*arr[j];
        long sum = arr[i]+arr[j];
        i++;
        j--;
        while (i<j){
            if (arr[i]+arr[j] != sum){
                    System.out.println(-1);
                return;
            }
            ans += (arr[i]*arr[j]);
            i++;
            j--;
        }
        System.out.println(ans);
    }
    public static void sort(int[] arr){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int x: arr)
            ls.add(x);
        Collections.sort(ls);
        for(int i=0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }
    public static void sort(long[] arr){
        ArrayList<Long> ls = new ArrayList<Long>();
        for(long x: arr)
            ls.add(x);
        Collections.sort(ls);
        for(int i=0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }
    public static void print(int[] arr){
        for(int x: arr)
                System.out.print(x+" ");
           System.out.println();
    }
    static int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    static long maxSubArraySum(Deque<Long> a){
        long size = a.size();
        long tempMax = Integer.MIN_VALUE, maxEnd
                = 0;
        for (int i = 0; i < size; i++) {
            maxEnd = maxEnd + a.pollFirst();
            if (tempMax < maxEnd)
                tempMax = maxEnd;
            if (maxEnd < 0)
                maxEnd = 0;
        }
        return tempMax;
    }
    private static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        public FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}