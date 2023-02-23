/*
 * Number of distinct numbers
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given 2 numbers a, b.

You an perform at most b steps

In one step :
1- increase a by 3
2- decrease a by 3
3- multiply a by 2

Find number of distinct numbers we can make after performing at most b operations on a.
Input
The first line contains the number of tests T.

For each test case:
Input two integers a and b.

0 < T <= 100
1 <= a <= 100000
1 <= b <= 9
Output
Print answer on a separate line for each test case
Example
Sample Input
2
5 1
30 2

Sample Output
4
11

For test 1:-
In 0 steps, 5 can be formed
In 1 steps 2, 8, 10 can be formed

For test 2:-
in 0 step :- 30
in 1 step- 27 33 60
in 2 step:- 24, 30, 54, 30, 36, 66, 57 63 120

total unique number = 11
 */




 //import java.util.io; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int tc = sc.nextInt();
while(tc-->0){
int a = sc.nextInt();
int b = sc.nextInt();
HashSet<Integer> hs = new HashSet<>();
solve(hs,a,b);
System.out.println(hs.size());
}
}
public static void solve(HashSet<Integer>hs, int a, int b){
hs.add(a);
if(b>0){
solve(hs,a+3,b-1);
solve(hs,a-3,b-1);
solve(hs,a*2,b-1);
}
}
}