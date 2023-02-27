/*
 * Golden Ratio
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Check if given two number are in golden ratio.

Two numbers are said to be in the golden ratio if their ratio is the same as the ratio of the sum of the two numbers to the larger number . If A>B>0 then A and B are in golden ratio if
A+B / A = A/B = 1.618

Note : precision is important here .
Input
First line have first float number (A)
Second line have second float number (B)
Output
Yes if two number form golden ratio, if not then No.
Example
1
0.618
Yes
61.77
38.22
Yes
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in)	;								

	float a = sc.nextFloat();
	float b = sc.nextFloat();								

	if (a <= b)
	{
		float temp = a;
		a = b;
		b = temp;
	}
	
	String ratio1 = String.format("%.2f", a / b);
	
	String ratio2 = String.format("%.2f", (a + b) / a);
	
	if (ratio1.equals(ratio2)) {
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	
	}
}
}