/*
 * Common digits in two numbers
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are two number a and b are given as input. Print common digits with common index in these numbers seperated by space.
Input
There are two number a and b are given as input.

Constraints
1 <= a, b <= 106
Output
Print common digits with common index in these numbers seperated by space.
Example
Sample Input:
24324345 3546434
Sample Output:
4 3 4
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String str[]=sc.nextLine().split(" ");
    String x,y;
    if(str[0].length()>str[1].length()){
        x=str[1];
        y=str[0];
    }else{
        x=str[0];
        y=str[1];
    }
    for(int i=0;i<x.length();i++){
        if(x.charAt(i)==y.charAt(i)){
            System.out.print(x.charAt(i)+" ");
        }
    }
    }
}