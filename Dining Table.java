/*
Dining Table
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has guests coming over to her house for dinner. She has a circular dining table of radius R and circular plates of radius r. Now she wonders if her table has enough space for all the guests, considering each guest takes one plate and the plate should lie completely inside the table.
Input
The input contains three space- separated integers N(Number of guests), R, and r.

Constraints:-
1 <= N <= 100
1 <= r, R <= 1000
Output
Print "Yes" if there is enough space, else print "No".
Example
Sample Input:-
4 10 4

Sample Output:-
Yes

Sample Input:-
5 10 4

Sample Output:-
No

*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int N = s.nextInt(); // no. of plates
        int R = s.nextInt(); // radius of table
        int r = s.nextInt(); // radius of plate
        double theta = Math.asin(r/(double)(R-r));
        double value = Math.PI/theta;
        if (N>value || r>R) {
            System.out.println("No");
        }  else {
            System.out.println("Yes");
        }
        // Your code here
    }
}