/*
 * Simple Circle (Simple Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
People prefer smartness over anything. You know N people and their smartness level. You need to place people in a circle one by one in any order. The happiness that a person gets is equal to the minimum smartness value of its clockwise neighbour and its anti-clockwise neighbour at the time when he enters the circle. You can ask the person to stand at any position of the circle that you like. The happiness of the first person to enter is 0 since he has no neighbours.

Find the maximum value of total happiness that can be achieved (sum of happiness of all the people).
Input
The first line of the input contains an integer N, the number of people you know.
The second line of the input contains N integers, the smartness of the N people that you know.

Constraints
2 <= N <= 200000
1 <= smartness of any person <= 109
Output
Output a single integer the maximum value of total happiness.
Example
Sample Input
4
2 2 1 3

Sample Output
7

Explanation
We ask the persons to enter the circle in this particular order of smartness [3, 2, 2, 1].
Step 1:
3

Happiness attained = 0

Step 2
3
2

Happiness attained = 3

Step 3
3
2
2

Happiness attained = 2

Step 4
3
1 2
2

Happiness attained = 2

Total Happiness = 0 + 3 + 2 + 2 = 7.

Sample Input
2
1 1

Sample Output
1
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long res = arr[n-1];
        for(int i = n - 2, x = 1; x < n - 2; x += 2, i -= 1){
            res += 2*arr[i];
        }
        System.out.println(res);
    }
}