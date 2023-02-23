/*
 * Next vowel
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string of length n consisting of lowercase English letters. Find the vowels in the string and replace each vowel with it's next vowel in the alphabetic order.

Next vowel of a vowel is another vowel that comes after it in alphabet. Next vowel of { 'a', 'e', 'i', 'o', 'u'} are { 'e', 'i', 'o', 'u', 'a' } respectively.
Input
First line contains n.
Next line contains a string.

Constraints
1 <= n <= 105
Output
print the string after replacing each vowel with it's next vowel.
Example
Input:
4
deaf

Output:
dief

Explanation:
next vowel of 'e' = 'i'
next vowel of 'a' = 'e'
 */









 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
        char x=str.charAt(i);
        if(x=='a'){
            System.out.print("e");
        }else if(x=='e'){
             System.out.print("i");
        }else if(x=='i'){
             System.out.print("o");
        }else if(x=='o'){
             System.out.print("u");
        }else if(x=='u'){
             System.out.print("a");
        }else{
             System.out.print(x);
        }
    }
    }
}