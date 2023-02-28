/*
 * Eat or be Eaten
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is playing a game in which there are N enemies. The rules of the game are simple

* if the strength of Sara's character is greater than or equal to the enemy, Sara's character wins and eats its enemy else if the strength is less then it will be eaten by the
enemy.
* Sara can choose which enemy to fight
* The strength of the defeated opponent will be added to the winner.

Given the strengths of all the enemies and the initial strength of Sara's character, will it be possible for her to win the game.
Input
The first line of input contains N and Sara's character initial strength X. The next line of input contains N space separated integers.

Constraints:-
1 <= N <= 105
1 <= X, Arr[i] <= 105
Output
Print "YES" if Sara can win else print "NO".
Example
Sample Input:-
5 10
3 9 19 5 21

Sample Output:-
YES

Explanation:-
Sara can fight enemies in the order:- 9 19 3 5 21

Sample Input:-
5 2
20 3 5 1 4

Sample Output:_
NO

 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] enemies = new int[n];

        for (int i = 0; i < n; i++) {
            enemies[i] = sc.nextInt();
        }

        Arrays.sort(enemies);

        for (int enemy : enemies) {
            if (enemy < x) {
                x += enemy;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
