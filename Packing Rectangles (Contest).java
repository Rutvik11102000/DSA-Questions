/*
 * Packing Rectangles (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are n rectangles of the same size: w in width and h in length. It is required to find a square of the smallest size into which these rectangles can be packed. Rectangles cannot be rotated.
Input
The first line of the input contains three space-separated integers w, h and n.

Constraints
1 ≤ w, h, n ≤ 109
Output
Output the minimum length of a side of a square, into which the given rectangles can be packed.
Example
Sample Input :
2 3 10
Sample Output:
9

Explanation:
9 is the minimum size of the square in which all these rectangles can fit.

 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


import java.math.BigInteger;

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
long w = sc.nextLong();
long h = sc.nextLong();
int n = sc.nextInt();
long s =0L,e = 1000000000000000L;
long ans =e;
while(s<=e){
long m = (s+e)/2;
long rowFit = m/w;
long colFit = m/h;
BigInteger maxFit = new BigInteger(String.valueOf(rowFit)).multiply(new BigInteger(String.valueOf(colFit)));
if(maxFit.compareTo(BigInteger.valueOf(n))>=0){
ans=m;
e=m-1;
}
else{
s=m+1;
}
}
System.out.println(ans);
}
}