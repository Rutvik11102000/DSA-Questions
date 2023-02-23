/*
 * Help Aryan
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Aryan was given a string, He was asked to print the first and last repeated character in a string.
Input
The first line of the input contains a string str.

Constraints
1 ≤ |str| ≤ 105
Output
Print the first and last repeated character of a string.
Example
Sample Input
newtonschool

Sample Output
n o

Explanation
The first repeated character is n as it occurs 2 times in complete string and the last repeated character is o.
 */





 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print(first(str)+" ");
		System.out.print(second(str)+" ");
	}
	static char first(String str) {
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return str.charAt(i);
				}
			}
		}
		return 0;
	}
	
	static char second(String str) {
		for(int i=str.length()-1;i>=1;i--) {
			for(int j=str.length()-2;j>=0;j--) {
				if(str.charAt(i) == str.charAt(j)) {
					return str.charAt(i);
				}
			}
		}
		return 0;
	}
}