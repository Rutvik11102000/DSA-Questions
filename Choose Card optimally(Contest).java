/*
 * Choose Card optimally(Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
shubham and maruti play a game. Maruti has n cards, and the i- th of them has the integer ai written on it. Bob has m cards, and the j- th of them has the integer bj written on it.
On the first turn of the game, the first player chooses one card and puts it on the table (plays it). On the second turn, the second player chooses one card such that the integer on it is greater than the integer on the card played on the first turn, and plays it. On the third turn, the first player chooses one card such that the integer on it is greater than the integer on the card played on the second turn, and plays it, and so on continues.
The players take turns, and each player has to choose one of his/her cards with a greater integer than the card played by the other player on the last turn.


who wins if Maruti is the first player?
Print Maruti if "Maruti" wins else "Shubham" without quotes.
Input
The first line consists of two space-separated integers n and m.
The second line contains n space-separated integers elements of the array a having cards of Maruti.
The third line contains m space-separated integers denoting elements of the array b having cards of shubham.

Constraints:
1 ≤ n, m ≤ 105
0 ≤ ai] ≤ 106
0 ≤ b[j] ≤ 106
0 ≤ i ≤ n-1
0 ≤ j ≤ m-1
Output
Print Maruti if "Maruti" wins else "Shubham" without quotes.
Example
Sample Input:
1 2
6
6 8

Sample Output:
Shubham

Explanation:
Maruti has one card with integer 6, and Shubham has two cards with numbers [6, 8].
If Maruti is the first player, she has to play the card with the number 6. Shubham then has to play the card with the number 8. Maruti has no cards left, so he loses.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m= sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();

        }
        for(int i =0;i<m;i++)
        {
            b[i] = sc.nextInt();

        }
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n-1]<b[m-1]){
            System.out.print("Shubham");
        }else{
            System.out.print("Maruti");
        }
    }
}