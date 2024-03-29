/*
 * Guardians of Galaxy
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
After saving the planet of Xander in 2014 from Ronan, the guardians of the galaxy decided to play a game on it. Between the vast furious oceans, they discover a row of buildings. The buildings are of different heights arranged at each index along a number line. Gamora starts at building 0 and a height of 0. Groot gets the task to determine the minimum thrust that Gamora needs at the start of the game so that she can jump to the top of each building without her thrust going below zero. Write a code to help Groot with his task.
The units of height relate directly to units of thrust. Gamora’s thrust level is calculated as follows:
• If gamora's thrust is less than the height of the building, her new thrust = gamora's thrust – (height – gamora's thrust)
• If gamora's thrust is greater than equal to the height of the building, her new thrust = gamora's thrust + (gamora's thrust - height)
Input
The first line contains an integer n, the number of buildings.
The second line n space-separated integers, arr[1], arr[2]…arr[n], the heights of the building.

Constraints:-
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 105
Output
The output contains a single integer denoting the minimum thrust Gamora needs at the start of the game.
Example
Sample Input:-
5
3 4 3 2 4

Sample Output:-
4

Explanation:-
If we take 3 then:-
at index 1:- 3 + 3-3 = 3
at index 2:- 3 - (4-3) = 2
at index 3:- 2 - (3-2) = 1
at index 4:- 1 - (2-1) = 0

Sample Input:-
3
4 4 4

Sample Output:-
4
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
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       long low =0;
       long high= Integer.MAX_VALUE;
       long ans =0;
       while(low <= high){
           long mid = low+ (high -low) /2;
           long newThrust = mid;
           newThrust = gamoThrust(arr, newThrust);
           if(newThrust >= 0){
               ans = mid;
               high = mid -1;
           }else{
               low = mid +1;
           }
       }
    
    System.out.println(ans);
}
private static long gamoThrust(int[] arr, long newThrust){
    for(int i =0; i< arr.length; i++){
        newThrust = newThrust*2 - arr[i];
        if(newThrust >= Integer.MAX_VALUE){
            return 1;
        }
        if(newThrust <0){
            return -1;
        }
    }
    return newThrust;
}
}
