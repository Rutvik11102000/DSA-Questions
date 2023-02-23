/*
 * Lucky number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A 2n digits number is said to be lucky if sum of n most significant digits is equal to sum of n least significant digits.

Given a number find out if the number is lucky or not?
Input
First line contains n.
Next line contains a number of 2n digits.

Constraints
1 ≤ n ≤ 105
Number contains digits only.
Output
Print "LUCKY" if the number is lucky otherwise print "UNLUCKY".
Example
Input:
3
213411

Output:
LUCKY

Explanation :
sum of 3 most significant digits = 2 + 1 + 3 = 6
sum of 3 least significant digits = 4 + 1 + 1 = 6

Input:
1
69

Output:
UNLUCKY

 */




 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = scanner.nextInt();
        String number = scanner.next();
        
        // Calculate sum of n most significant digits
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += Character.getNumericValue(number.charAt(i));
        }
        
        // Calculate sum of n least significant digits
        int sum2 = 0;
        for (int i = n; i < 2*n; i++) {
            sum2 += Character.getNumericValue(number.charAt(i));
        }
        
        // Check if the number is lucky or not
        if (sum1 == sum2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("UNLUCKY");
        }
        
        scanner.close();
    }
}