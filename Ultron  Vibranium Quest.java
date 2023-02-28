/*
 * Ultron : Vibranium Quest
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a room filled with ‘V’ kg of vibranium and Ultron wants his robot army to get the vibranium from that room. N robots are sent with the value of vibranium each of them has to bring. For each i the ith robot wants to bring ‘Ai’ amount of vibranium. Robots come in and try to take vibranium one by one in increasing order of their indices. Whenever a robot tries to take vibranium from the room, if the room has at least required amount of vibranium, then only the robot gets the vibranium otherwise the robot has to return without any vibranium. Each robot determine whether they will get the required amount of vibranium or not.
Input
The First line consists of two integers N( Number of robots ) and V ( Total amount of vibranium in the room ). The next line of input contains N space separated integers depicting the A1, A2. AN.

Constraints:-
1 <= N <= 100000
1 <= V <= 1000000
1 <= A[i] <= 100000
Output
Print N length string. The ith character should be 1 if the robot gets the vibranium or 0(zero) otherwise.
Example
Sample Input:-
5 10
3 5 3 2 1

Sample Output:-
11010

Explanation:-
The room initially contains 10kg of vibranium, the first robot comes and withdraws 3kg, the the vibranium left in the room is 7kg, then the second robot comes and withdraws 5kg, amount left is 2kg ; when the 3rd robot comes to take 3kg of vibranium he returns empty handed because the amount of vibranium left is only 2kg. The 4th robot comes and takes 2kg of vibranium and the 5th robot returns empty handed as there is no vibranium left to take from the room.

Sample Input:-
5 1
2 3 4 5 6

Sample Output:-
00000
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
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(k>= arr[i]){
                k -=arr[i];
                System.out.print("1");

            }else{
                System.out.print("0");
            }
        }
    }
}