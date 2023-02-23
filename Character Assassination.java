/*
 * Character Assassination
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a string S of length N. Along with that you are also given a character c. Find the string S after removing all occurences of character c from the string.
Input
The first line of the input contains a single integer N and a character c.
The second line of the input contains string S.

Constraints:
1 <= N <= 105
All characters in string S are loweracse english alphabets.
Output
Print the string S after removing all occurences of character c from the string.
Example
Sample Input:
5 e
becde

Sample Output:
bcd
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String str[]=sc.nextLine().split(" ");
    int n=Integer.parseInt(str[0]);
    char ch=str[1].charAt(0);
    String str1=sc.nextLine();
    for(int i=0;i<n;i++){
        if(str1.charAt(i)!=ch){
            System.out.print(str1.charAt(i));
        }
    }
    }
}