/*
 * Help Samar with Chopsticks (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Actually, a pair of chopsticks need not have two sticks that are the same length. You can eat with a pair of sticks as long as the length difference is no greater than D. Samar is appointed as a head chef of a restaurant. He is provided with N sticks, the ithstick of which is L[i] units long. More than one set of chopsticks cannot share the same stick. Assist him in matching the sticks to create as many functional pairs of chopsticks as possible.
Input
The first line contains two space-separated integers N and D. The next N lines contain one integer each, the ithline giving the value of L[i].

Constraints
1 ≤ N ≤ 10,000 (105)
0 ≤ D ≤ 1,000,000,000 (109)
1 ≤ L[i] ≤ 1,000,000,000 (109) for all integers i from 1 to N
Output
Output a single line containing the maximum number of pairs of chopsticks Samar can form.
Example
Sample Input :
5 2
1
3
3
9
4
Sample Output :
2
Explanation :
The 5 sticks have lengths 1, 3, 3, 9, and 4 respectively. The maximum allowed difference in the lengths of two sticks forming a pair is at most 2. It is clear that the 4th stick (length 9) cannot be used with any other stick. The remaining 4 sticks can be paired as (1st and 3rd) and (2nd and 5th) to form 2 pairs of usable chopsticks.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] chopsticks = new int[n];
        for (int i = 0; i < n; i++) {
            chopsticks[i] = sc.nextInt();
        }
        Arrays.sort(chopsticks);
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n && chopsticks[j] - chopsticks[i] <= d; j++) {
                count++;
                i = j;
                break;
            }
        }
        System.out.println(count);
    }
}