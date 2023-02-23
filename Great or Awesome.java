/*
 * Great or Awesome
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number.
If the number is greater than 3 then print "great".
If the number is greater than 5 then print "awesome".
If the number is not greater than 3 or 5, print "bad".
Input
A single integer x.

Constraints
-108 <= x <= 108
Output
Output a single string denoting the required answer.
Example
Sample Input 1:
3

Sample Output 1:
bad

Sample Input 2:
4

Sample Output 2:
great

Sample Input 3:
6

Sample Output 3:
awesome
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>5){
        System.out.println("awesome");
    } else if(n>3){
        System.out.println("great");
    }else{
        System.out.println("bad");
    }
    }
}