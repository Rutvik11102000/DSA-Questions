/*
 * Generate all parentheses
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, print all balanced bracket strings of length 2*N.
A bracket string is a string that contains only '(' and ')' as its characters.

Empty string is a balanced bracket string

If S is a balanced bracket string, so is (S)

If S and T are balanced bracket strings, so is ST


Print in lexicographical order. '(' appears before ')' in lexicographical order
Input
The single line of input containing an integer N.
1 <= N <= 15
Output
Print all possible balanced bracket strings of length 2*N in a separate line.
Example
Sample Input 1:
1

Sample Output 1:
()

Sample Input 2:
3

Sample Output 2:
((()))
(()())
()(())
()()()

Explanation:
It is printed in lexicographical order .
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> a= new ArrayList<>();
        a.add("()");
        a = premuB(a,n);
        for(int i =0;i<a.size();i++)
        System.out.println(a.get(i));

    }
    static ArrayList premuB(ArrayList<String> a,int n){
        if(n==1)
        return a;
        else{
            ArrayList<String>a2 = new ArrayList<>();
            for(int i=0;i<a.size();i++)
            a2.add("(" + a.get(i) + ")");
            for(int i=0;i<a.size();i++)
            a2.add("()" + a.get(i));
            return premuB(a2, n-1);
        }
    }
}