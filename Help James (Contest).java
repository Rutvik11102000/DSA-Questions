/*
 * Help James (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
James bought a music player. His favorite song is "Hello". He made a playlist containing N songs, each one having a distinct positive integer length. While James like all songs on his playlist, he enjoys "Hello" more than the others. He thought that he would arrange the songs in such a way that the songs are in ascending order of their length, after creating the playlist. For instance, if the song lengths in the playlist were 1, 3, 5, 2, 4, they would change to 1, 2, 3, 4, 5 after sorting. The "Hello" song was in position K in the playlist before sorting (1- indexing is assumed for the playlist). Help James to determine where the "Hello" song belongs in the sorted playlist provided he gives you all the details of the playlist.
Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains one integer N denoting the number of songs in James's playlist. The second line contains N space-separated integers A1, A2, ..., AN denoting the lengths of James's songs. The third line contains the only integer K - the position of the "Hello" song in the initial playlist.

Constraints
1 ≤ T ≤ 1000
1 ≤ K ≤ N ≤ 100
1 ≤ Ai ≤ 109
Output
For each test case, output a single line containing the position of the "Hello" song in the sorted playlist.
Example
Sample Input :
3
4
1 3 4 2
2
5
1 2 3 9 4
5
5
1 2 3 9 4
1
Sample Output :
3
4
1
Explanation :
In the first test case N equals to 4, K equals to 2, A equals to {1, 3, 4, 2}. The answer is 3, because {1, 3, 4, 2} - > {1, 2, 3, 4}. A2 now is on the 3- rd position.
In the second test case N equals to 5, K equals to 5, A equals to {1, 2, 3, 9, 4}. The answer is 4, because {1, 2, 3, 9, 4} - > {1, 2, 3, 4, 9}. A5 now is on the 4- th position.
In the third test case N equals to 5, K equals to 1, A equals to {1, 2, 3, 9, 4}. The answer is 1, because {1, 2, 3, 9, 4} - > {1, 2, 3, 4, 9}. A1 stays on the 1- th position.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            int hello = arr[k - 1];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < hello) {
                    count++;
                }
            }
            System.out.println(count + 1);
        }
        sc.close();
    }
}